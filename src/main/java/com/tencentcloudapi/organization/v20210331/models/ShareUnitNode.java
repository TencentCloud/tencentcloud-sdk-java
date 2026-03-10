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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShareUnitNode extends AbstractModel {

    /**
    * <p>共享部门ID。</p>
    */
    @SerializedName("ShareNodeId")
    @Expose
    private Long ShareNodeId;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get <p>共享部门ID。</p> 
     * @return ShareNodeId <p>共享部门ID。</p>
     */
    public Long getShareNodeId() {
        return this.ShareNodeId;
    }

    /**
     * Set <p>共享部门ID。</p>
     * @param ShareNodeId <p>共享部门ID。</p>
     */
    public void setShareNodeId(Long ShareNodeId) {
        this.ShareNodeId = ShareNodeId;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreateTime <p>创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreateTime <p>创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ShareUnitNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShareUnitNode(ShareUnitNode source) {
        if (source.ShareNodeId != null) {
            this.ShareNodeId = new Long(source.ShareNodeId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShareNodeId", this.ShareNodeId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

