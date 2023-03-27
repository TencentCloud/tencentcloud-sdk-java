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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationInfosResponse extends AbstractModel{

    /**
    * 应用列表
    */
    @SerializedName("ApplicationInfos")
    @Expose
    private ApplicationItem [] ApplicationInfos;

    /**
    * 是否包含所有的应用，0-不包含，1-包含
    */
    @SerializedName("AllOption")
    @Expose
    private Long AllOption;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 应用列表 
     * @return ApplicationInfos 应用列表
     */
    public ApplicationItem [] getApplicationInfos() {
        return this.ApplicationInfos;
    }

    /**
     * Set 应用列表
     * @param ApplicationInfos 应用列表
     */
    public void setApplicationInfos(ApplicationItem [] ApplicationInfos) {
        this.ApplicationInfos = ApplicationInfos;
    }

    /**
     * Get 是否包含所有的应用，0-不包含，1-包含 
     * @return AllOption 是否包含所有的应用，0-不包含，1-包含
     */
    public Long getAllOption() {
        return this.AllOption;
    }

    /**
     * Set 是否包含所有的应用，0-不包含，1-包含
     * @param AllOption 是否包含所有的应用，0-不包含，1-包含
     */
    public void setAllOption(Long AllOption) {
        this.AllOption = AllOption;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeApplicationInfosResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationInfosResponse(DescribeApplicationInfosResponse source) {
        if (source.ApplicationInfos != null) {
            this.ApplicationInfos = new ApplicationItem[source.ApplicationInfos.length];
            for (int i = 0; i < source.ApplicationInfos.length; i++) {
                this.ApplicationInfos[i] = new ApplicationItem(source.ApplicationInfos[i]);
            }
        }
        if (source.AllOption != null) {
            this.AllOption = new Long(source.AllOption);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ApplicationInfos.", this.ApplicationInfos);
        this.setParamSimple(map, prefix + "AllOption", this.AllOption);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

