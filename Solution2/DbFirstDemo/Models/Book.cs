using System;
using System.Collections.Generic;

namespace DbFirstDemo.Models;

public partial class Book
{
    public int? Bookid { get; set; }

    public string? BookName { get; set; }

    public string? AuthorName { get; set; }

    public override string ToString()
    {
        // Adjust this string to include the properties you want to display
        return $"Book ID: {Bookid}, Name: \"{BookName}\", Author: {AuthorName}";
    }

}
