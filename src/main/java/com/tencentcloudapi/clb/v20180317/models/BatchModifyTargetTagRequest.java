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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchModifyTargetTagRequest extends AbstractModel {

    /**
    * 负载均衡实例 ID。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 要批量修改标签的列表。
    */
    @SerializedName("ModifyList")
    @Expose
    private RsTagRule [] ModifyList;

    /**
     * Get 负载均衡实例 ID。 
     * @return LoadBalancerId 负载均衡实例 ID。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID。
     * @param LoadBalancerId 负载均衡实例 ID。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 要批量修改标签的列表。 
     * @return ModifyList 要批量修改标签的列表。
     */
    public RsTagRule [] getModifyList() {
        return this.ModifyList;
    }

    /**
     * Set 要批量修改标签的列表。
     * @param ModifyList 要批量修改标签的列表。
     */
    public void setModifyList(RsTagRule [] ModifyList) {
        this.ModifyList = ModifyList;
    }

    public BatchModifyTargetTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifyTargetTagRequest(BatchModifyTargetTagRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ModifyList != null) {
            this.ModifyList = new RsTagRule[source.ModifyList.length];
            for (int i = 0; i < source.ModifyList.length; i++) {
                this.ModifyList[i] = new RsTagRule(source.ModifyList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArrayObj(map, prefix + "ModifyList.", this.ModifyList);

    }
}

