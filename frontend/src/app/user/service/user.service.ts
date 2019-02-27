import {Injectable} from '@angular/core';
import { HttpClient} from '@angular/common/http';
import {Observable} from "rxjs/index";

@Injectable()
export class UserService {

  private userUrl : string;

  constructor(private http:HttpClient) {
    this.userUrl = window.location.protocol + "//" +  window.location.host + '/api/users';
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
