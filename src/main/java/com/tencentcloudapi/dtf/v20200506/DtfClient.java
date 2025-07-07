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
package com.tencentcloudapi.dtf.v20200506;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dtf.v20200506.models.*;

public class DtfClient extends AbstractClient{
    private static String endpoint = "dtf.tencentcloudapi.com";
    private static String service = "dtf";
    private static String version = "2020-05-06";

    public DtfClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DtfClient(Credential credential, String region, ClientProfile profile) {
        super(DtfClient.endpoint, DtfClient.version, credential, region, profile);
    }

    /**
     *查询主事务列表
     * @param req DescribeTransactionsRequest
     * @return DescribeTransactionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTransactionsResponse DescribeTransactions(DescribeTransactionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTransactions", DescribeTransactionsResponse.class);
    }

}
