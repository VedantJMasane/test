using DbFirstDemo.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DbFirstDemo
{
    class DB
    {
        static void Main(string[] args)
        {
            Display();
            Console.WriteLine("---------");
            //InsertRecord();
            Console.WriteLine("---------");
            Display();
        }
        public static void Display()
        {
            var db = new BooksContext();
            List<Book> lst = db.Books.ToList();
            foreach (var book in lst)
            {
                Console.WriteLine(book);
            }

        }
        public static void InsertRecord()
        {
            Book book = new Book()
            {
                Bookid = 10,
                BookName = "let us c",
                AuthorName="sagar"
            };
            using (var db = new BooksContext())
            {
                db.Books.Add(book);
                db.SaveChanges();
                Console.WriteLine("insert successfull");
            }
        }
    }
}
