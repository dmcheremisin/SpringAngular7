import {Injectable} from '@angular/core';
import { HttpClient} from '@angular/common/http';
import {Observable} from "rxjs/index";

@Injectable()
export class UserService {

  private userUrl : string = '/api/users';

  constructor(private http:HttpClient) {
  }

  public getUsers(): Observable<any> {
    return this.http.get(this.userUrl);
  }

  public deleteUser(user) {
    return this.http.delete(this.userUrl + "/"+ user.id);
  }

  public createUser(user) {
    return this.http.post(this.userUrl, user);
  }

}
