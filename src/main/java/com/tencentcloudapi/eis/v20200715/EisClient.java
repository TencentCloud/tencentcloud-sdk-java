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
package com.tencentcloudapi.eis.v20200715;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.eis.v20200715.models.*;

public class EisClient extends AbstractClient{
    private static String endpoint = "eis.tencentcloudapi.com";
    private static String service = "eis";
    private static String version = "2020-07-15";

    public EisClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EisClient(Credential credential, String region, ClientProfile profile) {
        super(EisClient.endpoint, EisClient.version, credential, region, profile);
    }

    /**
     *获取连接器配置参数
     * @param req DescribeEisConnectorConfigRequest
     * @return DescribeEisConnectorConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEisConnectorConfigResponse DescribeEisConnectorConfig(DescribeEisConnectorConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEisConnectorConfig", DescribeEisConnectorConfigResponse.class);
    }

    /**
     *获取连接器操作列表
     * @param req ListEisConnectorOperationsRequest
     * @return ListEisConnectorOperationsResponse
     * @throws TencentCloudSDKException
     */
    public ListEisConnectorOperationsResponse ListEisConnectorOperations(ListEisConnectorOperationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListEisConnectorOperations", ListEisConnectorOperationsResponse.class);
    }

    /**
     *连接器列表
     * @param req ListEisConnectorsRequest
     * @return ListEisConnectorsResponse
     * @throws TencentCloudSDKException
     */
    public ListEisConnectorsResponse ListEisConnectors(ListEisConnectorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListEisConnectors", ListEisConnectorsResponse.class);
    }

}
