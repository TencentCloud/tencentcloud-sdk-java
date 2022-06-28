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
package com.tencentcloudapi.tse.v20201207;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tse.v20201207.models.*;

public class TseClient extends AbstractClient{
    private static String endpoint = "tse.tencentcloudapi.com";
    private static String service = "tse";
    private static String version = "2020-12-07";

    public TseClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TseClient(Credential credential, String region, ClientProfile profile) {
        super(TseClient.endpoint, TseClient.version, credential, region, profile);
    }

    /**
     *创建引擎实例
     * @param req CreateEngineRequest
     * @return CreateEngineResponse
     * @throws TencentCloudSDKException
     */
    public CreateEngineResponse CreateEngine(CreateEngineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEngineResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEngineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEngine");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除引擎实例
     * @param req DeleteEngineRequest
     * @return DeleteEngineResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEngineResponse DeleteEngine(DeleteEngineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEngineResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEngineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEngine");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询Nacos类型引擎实例副本信息
     * @param req DescribeNacosReplicasRequest
     * @return DescribeNacosReplicasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNacosReplicasResponse DescribeNacosReplicas(DescribeNacosReplicasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNacosReplicasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNacosReplicasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNacosReplicas");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询nacos服务接口列表
     * @param req DescribeNacosServerInterfacesRequest
     * @return DescribeNacosServerInterfacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNacosServerInterfacesResponse DescribeNacosServerInterfaces(DescribeNacosServerInterfacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNacosServerInterfacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNacosServerInterfacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNacosServerInterfaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询引擎实例访问地址
     * @param req DescribeSREInstanceAccessAddressRequest
     * @return DescribeSREInstanceAccessAddressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSREInstanceAccessAddressResponse DescribeSREInstanceAccessAddress(DescribeSREInstanceAccessAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSREInstanceAccessAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSREInstanceAccessAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSREInstanceAccessAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询引擎实例列表
     * @param req DescribeSREInstancesRequest
     * @return DescribeSREInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSREInstancesResponse DescribeSREInstances(DescribeSREInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSREInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSREInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSREInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询Zookeeper类型注册引擎实例副本信息
     * @param req DescribeZookeeperReplicasRequest
     * @return DescribeZookeeperReplicasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZookeeperReplicasResponse DescribeZookeeperReplicas(DescribeZookeeperReplicasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZookeeperReplicasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZookeeperReplicasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeZookeeperReplicas");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询zookeeper服务接口列表
     * @param req DescribeZookeeperServerInterfacesRequest
     * @return DescribeZookeeperServerInterfacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZookeeperServerInterfacesResponse DescribeZookeeperServerInterfaces(DescribeZookeeperServerInterfacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZookeeperServerInterfacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZookeeperServerInterfacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeZookeeperServerInterfaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
