package com.me.aop.springaop.business;
import com.me.aop.springaop.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Business1
{
    @Autowired
    Dao1 dao1;

    public String calculateSomething()
    {
        return dao1.retrieveSomething();
    }
}
