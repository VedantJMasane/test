import { useReducer, useState } from "react";
import { useNavigate } from "react-router-dom";
export default function LoginComp() {
    const init = { 
                    username: "",   
                     password: "" 
                };

    const reducer = (state, action) => {
        switch (action.type) {
            case "update":
                return { ...state, [action.fld]: action.val };
            case "reset":
                return init;
            default:
                return state;
        }
    };

    const [info, dispatch] = useReducer(reducer, init);
    const [msg, setMsg] = useState("");
    const navigate = useNavigate();


    const sendData = (e) => {
        e.preventDefault();
        const reqOptions = {
            method: "POST",
            headers: { "content-type": "application/json" },
            body: JSON.stringify(info)
        }
        fetch("http://localhost:8080/checkLogin", reqOptions)
        .then(resp=>{
                if(resp.ok)
                {
                    console.log(resp.status)
                    return resp.text();
                }
                else
                {
                    console.log(resp.statusText)
                    throw new Error(" server error");
                }
        })
        .then(text=>text.length ? JSON.parse(text):{})
        .then(obj=>{
                    if(Object.keys(obj).length === 0 )
                    {
                        setMsg(" Wrong username/password");
                    }
                    else
                    {
                        if(obj.role_id.role_id === 1 )
                        {
                            navigate("/adminhome");
                        }
                        else if(obj.role_id.role_id === 2)
                        {
                            //return null;
                        }
                        if(obj.role_id.role_id === 3 )
                        {
                            //return null;
                        }
                    }
        })
        .catch((error)=>alert("some server error. try after some time."));
    };


    return (
        <div>
            <h1>Login Page</h1>
            <form>
                <div className="mb-3">
                    <label htmlFor="uid" className="form-label">
                        Enter Uid
                    </label>
                    <input type="text" 
                        className="form-control" 
                        name="username"
                        id="username"
                        value={info.username}
                        onChange={(e)=>{dispatch({type:'update', fld:'username', val: e.target.value    })}}
                    />
                </div>

                <div className="mb-3">
                    <label htmlFor="pwd" className="form-label">
                        Enter Password
                    </label>
                    <input
                        type="password"
                        className="form-control"
                        id="password"
                        name="password"
                        value={info.password}
                        onChange={(e)=>{dispatch({type:'update', fld:'password', val: e.target.value    })}}
                    />
                </div>

                <button type="submit" className="btn btn-primary " onClick={(e)=>{sendData(e)}}>
                    Submit
                </button>
                <button type="reset" className="btn btn-primary " onClick={() => dispatch({ type: 'reset' })}>
                    Reset
                </button>
            </form>

            <p>{JSON.stringify(info)}</p>
            <p>{JSON.stringify(msg)}</p>
        </div>
    );
}
