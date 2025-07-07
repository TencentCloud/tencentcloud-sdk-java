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
package com.tencentcloudapi.tics.v20181115;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tics.v20181115.models.*;

public class TicsClient extends AbstractClient{
    private static String endpoint = "tics.tencentcloudapi.com";
    private static String service = "tics";
    private static String version = "2018-11-15";

    public TicsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TicsClient(Credential credential, String region, ClientProfile profile) {
        super(TicsClient.endpoint, TicsClient.version, credential, region, profile);
    }

    /**
     *提供域名相关的基础信息以及与攻击事件（团伙、家族）、恶意文件等相关联信息。
     * @param req DescribeDomainInfoRequest
     * @return DescribeDomainInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainInfoResponse DescribeDomainInfo(DescribeDomainInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainInfo", DescribeDomainInfoResponse.class);
    }

    /**
     *提供文件相关的基础信息以及与攻击事件（团伙、家族）、恶意文件等相关联信息。
     * @param req DescribeFileInfoRequest
     * @return DescribeFileInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileInfoResponse DescribeFileInfo(DescribeFileInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileInfo", DescribeFileInfoResponse.class);
    }

    /**
     *提供IP相关的基础信息以及与攻击事件（团伙、家族）、恶意文件等相关联信息。
     * @param req DescribeIpInfoRequest
     * @return DescribeIpInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpInfoResponse DescribeIpInfo(DescribeIpInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIpInfo", DescribeIpInfoResponse.class);
    }

    /**
     *提供IP和域名相关威胁情报信息查询，这些信息可以辅助检测失陷主机、帮助SIEM/SOC等系统做研判决策、帮助运营团队对设备报警的编排处理。
     * @param req DescribeThreatInfoRequest
     * @return DescribeThreatInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeThreatInfoResponse DescribeThreatInfo(DescribeThreatInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeThreatInfo", DescribeThreatInfoResponse.class);
    }

}
