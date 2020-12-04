package user;

import book.BookList;
import operation.IOperation;

public abstract class User {//
    protected String name;

    protected IOperation[] operations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();//创建一个抽象方法,此时类就变成抽象类了

    public void doOperation(BookList bookList,int choice) {
        this.operations[choice].work(bookList);

    }


}
