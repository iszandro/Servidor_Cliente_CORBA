package ExApp;

/**
* ExApp/ExHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Ex.idl
* lunes 7 de noviembre de 2011 20H31' CST
*/

public final class ExHolder implements org.omg.CORBA.portable.Streamable
{
  public ExApp.Ex value = null;

  public ExHolder ()
  {
  }

  public ExHolder (ExApp.Ex initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ExApp.ExHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ExApp.ExHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ExApp.ExHelper.type ();
  }

}
