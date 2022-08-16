package Exemplo1.application;

import Exemplo1.entities.BusinessAccount;

public class Program
{

    public static void main(
        String[] args )
    {
        final BusinessAccount account = new BusinessAccount();

        account.deposit( 4 );

    }

}
