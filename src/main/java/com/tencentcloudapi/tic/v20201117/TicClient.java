/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tic.v20201117;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tic.v20201117.models.*;

public class TicClient extends AbstractClient{
    private static String endpoint = "tic.tencentcloudapi.com";
    private static String service = "tic";
    private static String version = "2020-11-17";

    public TicClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TicClient(Credential credential, String region, ClientProfile profile) {
        super(TicClient.endpoint, TicClient.version, credential, region, profile);
    }

    /**
     *本接口（ApplyStack）用于触发资源栈下某个版本的Apply事件。

- 当版本处于PLAN_IN_PROGRESS或APPLY_IN_PROGRESS状态时，将无法再执行本操作
- 当版本处于APPLY_COMPLETED状态时，本操作无法执行
     * @param req ApplyStackRequest
     * @return ApplyStackResponse
     * @throws TencentCloudSDKException
     */
    public ApplyStackResponse ApplyStack(ApplyStackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyStackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyStackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyStack");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateStack）用于通过传递一个COS的terraform zip模版URL来创建一个资源栈。创建资源栈后仍需要用户调用对应的plan, apply, destory执行对应的事件。
     * @param req CreateStackRequest
     * @return CreateStackResponse
     * @throws TencentCloudSDKException
     */
    public CreateStackResponse CreateStack(CreateStackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateStackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateStackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateStack");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateStackVersion）用于给资源栈新增一个HCL模版版本，仅限COS链接，且为zip格式。
     * @param req CreateStackVersionRequest
     * @return CreateStackVersionResponse
     * @throws TencentCloudSDKException
     */
    public CreateStackVersionResponse CreateStackVersion(CreateStackVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateStackVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateStackVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateStackVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteStack）用于删除一个资源栈（配置、版本、事件信息）。但不会销毁资源管理的云资源。如果需要销毁资源栈管理的云资源，请调用 DestoryStack 接口销毁云资源。
     * @param req DeleteStackRequest
     * @return DeleteStackResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStackResponse DeleteStack(DeleteStackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteStackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteStackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteStack");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteStackVersion）用于删除一个版本，处于PLAN_IN_PROGRESS和APPLY_IN_PROGRESS状态中的版本无法删除。
     * @param req DeleteStackVersionRequest
     * @return DeleteStackVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStackVersionResponse DeleteStackVersion(DeleteStackVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteStackVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteStackVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteStackVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeStackEvent）用于获取单个事件详情，尤其是可以得到事件的详细控制台输出文本。
     * @param req DescribeStackEventRequest
     * @return DescribeStackEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStackEventResponse DescribeStackEvent(DescribeStackEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStackEventResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStackEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStackEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeStackEvents）用于查看一个或多个事件详细信息。

- 可以根据事件ID过滤感兴趣的事件
- 也可以根据版本ID，资源栈ID，事件类型，事件状态过滤事件，过滤信息详细请见过滤器Filter
- 如果参数为空，返回当前用户一定数量（Limit所指定的数量，默认为20）的事件
     * @param req DescribeStackEventsRequest
     * @return DescribeStackEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStackEventsResponse DescribeStackEvents(DescribeStackEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStackEventsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStackEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStackEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeStackVersions）用于查询一个或多个版本的详细信息。

- 可以根据版本ID查询感兴趣的版本
- 可以根据版本名字和状态来过滤版本，详见过滤器Filter
- 如果参数为空，返回当前用户一定数量（Limit所指定的数量，默认为20）的版本
     * @param req DescribeStackVersionsRequest
     * @return DescribeStackVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStackVersionsResponse DescribeStackVersions(DescribeStackVersionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStackVersionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStackVersionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStackVersions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeStacks）用于查询一个或多个资源栈的详细信息。

- 可以根据资源栈ID来查询感兴趣的资源栈信息
- 若参数为空，返回当前用户一定数量（Limit所指定的数量，默认为20）的资源栈
     * @param req DescribeStacksRequest
     * @return DescribeStacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStacksResponse DescribeStacks(DescribeStacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStacksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStacksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStacks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DestroyStack）用于删除资源栈下的某个版本所创建的资源。
     * @param req DestroyStackRequest
     * @return DestroyStackResponse
     * @throws TencentCloudSDKException
     */
    public DestroyStackResponse DestroyStack(DestroyStackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyStackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyStackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyStack");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（PlanStack）用于触发资源栈下某个版本的PLAN事件。

- 当版本处于PLAN_IN_PROGRESS或APPLY_IN_PROGRESS状态时，将无法再执行本操作
- 当版本处于APPLY_COMPLETED状态时，本操作无法执行
     * @param req PlanStackRequest
     * @return PlanStackResponse
     * @throws TencentCloudSDKException
     */
    public PlanStackResponse PlanStack(PlanStackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PlanStackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PlanStackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PlanStack");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateStack）用于更新资源栈的名称和描述。
     * @param req UpdateStackRequest
     * @return UpdateStackResponse
     * @throws TencentCloudSDKException
     */
    public UpdateStackResponse UpdateStack(UpdateStackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateStackResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateStackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateStack");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateStackVersion）用于更新一个版本的模版内容，名称或描述，模版仅限COS URL，且为zip格式。
     * @param req UpdateStackVersionRequest
     * @return UpdateStackVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateStackVersionResponse UpdateStackVersion(UpdateStackVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateStackVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateStackVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateStackVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
