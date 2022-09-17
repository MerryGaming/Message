package org.aibles.library2.service;

import java.util.List;
import org.aibles.library2.dto.request.CreateUserRequest;
import org.aibles.library2.dto.request.UpdateUserRequest;
import org.aibles.library2.dto.response.UserResponse;


public interface UserService {

  UserResponse created(CreateUserRequest createUserRequest);

  List<UserResponse> list();

  UserResponse update(long id, UpdateUserRequest updateUser);
}
