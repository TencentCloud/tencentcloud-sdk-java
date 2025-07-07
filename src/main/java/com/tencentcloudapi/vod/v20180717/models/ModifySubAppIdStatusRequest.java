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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySubAppIdStatusRequest extends AbstractModel {

    /**
    * <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 应用状态，取值范围：
<li>On：启用。</li>
<li>Off：停用。</li>
<li>Destroyed：销毁。</li>
当前状态如果是 Destoying ，不能进行启用操作，需要等待销毁完成后才能重新启用。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b> 
     * @return SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     * @param SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 应用状态，取值范围：
<li>On：启用。</li>
<li>Off：停用。</li>
<li>Destroyed：销毁。</li>
当前状态如果是 Destoying ，不能进行启用操作，需要等待销毁完成后才能重新启用。 
     * @return Status 应用状态，取值范围：
<li>On：启用。</li>
<li>Off：停用。</li>
<li>Destroyed：销毁。</li>
当前状态如果是 Destoying ，不能进行启用操作，需要等待销毁完成后才能重新启用。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 应用状态，取值范围：
<li>On：启用。</li>
<li>Off：停用。</li>
<li>Destroyed：销毁。</li>
当前状态如果是 Destoying ，不能进行启用操作，需要等待销毁完成后才能重新启用。
     * @param Status 应用状态，取值范围：
<li>On：启用。</li>
<li>Off：停用。</li>
<li>Destroyed：销毁。</li>
当前状态如果是 Destoying ，不能进行启用操作，需要等待销毁完成后才能重新启用。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifySubAppIdStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySubAppIdStatusRequest(ModifySubAppIdStatusRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

