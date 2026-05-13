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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmIdentifyAssetStatistic extends AbstractModel {

    /**
    * 关联资产管理员数。
    */
    @SerializedName("ManagerCount")
    @Expose
    private Long ManagerCount;

    /**
    * 关联资产普通成员数。
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

    /**
     * Get 关联资产管理员数。 
     * @return ManagerCount 关联资产管理员数。
     */
    public Long getManagerCount() {
        return this.ManagerCount;
    }

    /**
     * Set 关联资产管理员数。
     * @param ManagerCount 关联资产管理员数。
     */
    public void setManagerCount(Long ManagerCount) {
        this.ManagerCount = ManagerCount;
    }

    /**
     * Get 关联资产普通成员数。 
     * @return MemberCount 关联资产普通成员数。
     */
    public Long getMemberCount() {
        return this.MemberCount;
    }

    /**
     * Set 关联资产普通成员数。
     * @param MemberCount 关联资产普通成员数。
     */
    public void setMemberCount(Long MemberCount) {
        this.MemberCount = MemberCount;
    }

    public DspmIdentifyAssetStatistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyAssetStatistic(DspmIdentifyAssetStatistic source) {
        if (source.ManagerCount != null) {
            this.ManagerCount = new Long(source.ManagerCount);
        }
        if (source.MemberCount != null) {
            this.MemberCount = new Long(source.MemberCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ManagerCount", this.ManagerCount);
        this.setParamSimple(map, prefix + "MemberCount", this.MemberCount);

    }
}

