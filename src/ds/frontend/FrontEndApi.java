package ds.frontend;

import ds.client.RequestParameters;
import ds.movies.MovieDetails;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FrontEndApi extends Remote {
    MovieDetails query(RequestParameters parameters) throws RemoteException;

    boolean update(RequestParameters parameters) throws RemoteException;

    boolean submit(RequestParameters parameters) throws RemoteException;
}
