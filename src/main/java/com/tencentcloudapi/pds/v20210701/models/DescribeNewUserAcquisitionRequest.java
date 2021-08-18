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
package com.tencentcloudapi.pds.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNewUserAcquisitionRequest extends AbstractModel{

    /**
    * 用户信息
    */
    @SerializedName("ServiceParams")
    @Expose
    private UserInfos ServiceParams;

    /**
     * Get 用户信息 
     * @return ServiceParams 用户信息
     */
    public UserInfos getServiceParams() {
        return this.ServiceParams;
    }

    /**
     * Set 用户信息
     * @param ServiceParams 用户信息
     */
    public void setServiceParams(UserInfos ServiceParams) {
        this.ServiceParams = ServiceParams;
    }

    public DescribeNewUserAcquisitionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNewUserAcquisitionRequest(DescribeNewUserAcquisitionRequest source) {
        if (source.ServiceParams != null) {
            this.ServiceParams = new UserInfos(source.ServiceParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ServiceParams.", this.ServiceParams);

    }
}

