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
package com.tencentcloudapi.habo.v20181203;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.habo.v20181203.models.*;

public class HaboClient extends AbstractClient{
    private static String endpoint = "habo.tencentcloudapi.com";
    private static String version = "2018-12-03";

    public HaboClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public HaboClient(Credential credential, String region, ClientProfile profile) {
        super(HaboClient.endpoint, HaboClient.version, credential, region, profile);
    }

    /**
     *查询指定md5样本是否分析完成，并获取分析日志下载地址。
     * @param req DescribeStatusRequest
     * @return DescribeStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStatusResponse DescribeStatus(DescribeStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上传样本到哈勃进行分析，异步生成分析日志。
     * @param req StartAnalyseRequest
     * @return StartAnalyseResponse
     * @throws TencentCloudSDKException
     */
    public StartAnalyseResponse StartAnalyse(StartAnalyseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartAnalyseResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartAnalyseResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartAnalyse"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
