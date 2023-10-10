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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBanWhiteListResponse extends AbstractModel{

    /**
    * 是否全局规则
    */
    @SerializedName("IsGlobal")
    @Expose
    private Boolean IsGlobal;

    /**
    * 添加规则是否重复
    */
    @SerializedName("IsDuplicate")
    @Expose
    private Boolean IsDuplicate;

    /**
    * 重复机器的信息
    */
    @SerializedName("DuplicateHosts")
    @Expose
    private DuplicateHosts [] DuplicateHosts;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否全局规则 
     * @return IsGlobal 是否全局规则
     */
    public Boolean getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 是否全局规则
     * @param IsGlobal 是否全局规则
     */
    public void setIsGlobal(Boolean IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 添加规则是否重复 
     * @return IsDuplicate 添加规则是否重复
     */
    public Boolean getIsDuplicate() {
        return this.IsDuplicate;
    }

    /**
     * Set 添加规则是否重复
     * @param IsDuplicate 添加规则是否重复
     */
    public void setIsDuplicate(Boolean IsDuplicate) {
        this.IsDuplicate = IsDuplicate;
    }

    /**
     * Get 重复机器的信息 
     * @return DuplicateHosts 重复机器的信息
     */
    public DuplicateHosts [] getDuplicateHosts() {
        return this.DuplicateHosts;
    }

    /**
     * Set 重复机器的信息
     * @param DuplicateHosts 重复机器的信息
     */
    public void setDuplicateHosts(DuplicateHosts [] DuplicateHosts) {
        this.DuplicateHosts = DuplicateHosts;
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

    public CreateBanWhiteListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBanWhiteListResponse(CreateBanWhiteListResponse source) {
        if (source.IsGlobal != null) {
            this.IsGlobal = new Boolean(source.IsGlobal);
        }
        if (source.IsDuplicate != null) {
            this.IsDuplicate = new Boolean(source.IsDuplicate);
        }
        if (source.DuplicateHosts != null) {
            this.DuplicateHosts = new DuplicateHosts[source.DuplicateHosts.length];
            for (int i = 0; i < source.DuplicateHosts.length; i++) {
                this.DuplicateHosts[i] = new DuplicateHosts(source.DuplicateHosts[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "IsDuplicate", this.IsDuplicate);
        this.setParamArrayObj(map, prefix + "DuplicateHosts.", this.DuplicateHosts);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

