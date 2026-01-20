/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.evt.v20250217;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.evt.v20250217.models.*;

public class EvtClient extends AbstractClient{
    private static String endpoint = "evt.tencentcloudapi.com";
    private static String service = "evt";
    private static String version = "2025-02-17";

    public EvtClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EvtClient(Credential credential, String region, ClientProfile profile) {
        super(EvtClient.endpoint, EvtClient.version, credential, region, profile);
    }

    /**
     *执行审批
     * @param req CompleteApprovalRequest
     * @return CompleteApprovalResponse
     * @throws TencentCloudSDKException
     */
    public CompleteApprovalResponse CompleteApproval(CompleteApprovalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CompleteApproval", CompleteApprovalResponse.class);
    }

    /**
     *创建人员
     * @param req CreateRoleUserRequest
     * @return CreateRoleUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoleUserResponse CreateRoleUser(CreateRoleUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRoleUser", CreateRoleUserResponse.class);
    }

    /**
     *删除自定义用户
     * @param req DeleteRoleUserRequest
     * @return DeleteRoleUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoleUserResponse DeleteRoleUser(DeleteRoleUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRoleUser", DeleteRoleUserResponse.class);
    }

    /**
     *推送事件数据
     * @param req PutEventRequest
     * @return PutEventResponse
     * @throws TencentCloudSDKException
     */
    public PutEventResponse PutEvent(PutEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PutEvent", PutEventResponse.class);
    }

    /**
     *推送事件数据
     * @param req PutMessageRequest
     * @return PutMessageResponse
     * @throws TencentCloudSDKException
     */
    public PutMessageResponse PutMessage(PutMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PutMessage", PutMessageResponse.class);
    }

}
