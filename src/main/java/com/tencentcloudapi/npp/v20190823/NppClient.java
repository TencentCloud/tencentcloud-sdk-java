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
package com.tencentcloudapi.npp.v20190823;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.npp.v20190823.models.*;

public class NppClient extends AbstractClient{
    private static String endpoint = "npp.tencentcloudapi.com";
    private static String service = "npp";
    private static String version = "2019-08-23";

    public NppClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public NppClient(Credential credential, String region, ClientProfile profile) {
        super(NppClient.endpoint, NppClient.version, credential, region, profile);
    }

    /**
     *回拨呼叫请求
     * @param req CreateCallBackRequest
     * @return CreateCallBackResponse
     * @throws TencentCloudSDKException
     */
    public CreateCallBackResponse CreateCallBack(CreateCallBackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCallBack", CreateCallBackResponse.class);
    }

    /**
     *直拨解绑中间号
     * @param req DelVirtualNumRequest
     * @return DelVirtualNumResponse
     * @throws TencentCloudSDKException
     */
    public DelVirtualNumResponse DelVirtualNum(DelVirtualNumRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DelVirtualNum", DelVirtualNumResponse.class);
    }

    /**
     *回拨呼叫取消
     * @param req DeleteCallBackRequest
     * @return DeleteCallBackResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCallBackResponse DeleteCallBack(DeleteCallBackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCallBack", DeleteCallBackResponse.class);
    }

    /**
     *回拨话单获取接口
     * @param req DescribeCallBackCdrRequest
     * @return DescribeCallBackCdrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCallBackCdrResponse DescribeCallBackCdr(DescribeCallBackCdrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCallBackCdr", DescribeCallBackCdrResponse.class);
    }

    /**
     *回拨通话状态获取
     * @param req DescribeCallBackStatusRequest
     * @return DescribeCallBackStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCallBackStatusResponse DescribeCallBackStatus(DescribeCallBackStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCallBackStatus", DescribeCallBackStatusResponse.class);
    }

    /**
     *回拨拉取主叫显号号码集合
     * @param req DescribeCallerDisplayListRequest
     * @return DescribeCallerDisplayListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCallerDisplayListResponse DescribeCallerDisplayList(DescribeCallerDisplayListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCallerDisplayList", DescribeCallerDisplayListResponse.class);
    }

    /**
     *直拨话单获取接口
     * @param req Get400CdrRequest
     * @return Get400CdrResponse
     * @throws TencentCloudSDKException
     */
    public Get400CdrResponse Get400Cdr(Get400CdrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Get400Cdr", Get400CdrResponse.class);
    }

    /**
     *直拨获取中间号（App 使用方发起）
     * @param req GetVirtualNumRequest
     * @return GetVirtualNumResponse
     * @throws TencentCloudSDKException
     */
    public GetVirtualNumResponse GetVirtualNum(GetVirtualNumRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetVirtualNum", GetVirtualNumResponse.class);
    }

}
