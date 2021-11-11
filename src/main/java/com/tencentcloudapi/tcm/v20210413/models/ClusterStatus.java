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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterStatus extends AbstractModel{

    /**
    * 关联状态，取值范围：
- LINKING: 关联中
- LINKED: 已关联
- UNLINKING: 解关联中
- LINK_FAILED: 关联失败
- UNLINK_FAILED: 解关联失败
    */
    @SerializedName("LinkState")
    @Expose
    private String LinkState;

    /**
    * 关联错误详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinkErrorDetail")
    @Expose
    private String LinkErrorDetail;

    /**
     * Get 关联状态，取值范围：
- LINKING: 关联中
- LINKED: 已关联
- UNLINKING: 解关联中
- LINK_FAILED: 关联失败
- UNLINK_FAILED: 解关联失败 
     * @return LinkState 关联状态，取值范围：
- LINKING: 关联中
- LINKED: 已关联
- UNLINKING: 解关联中
- LINK_FAILED: 关联失败
- UNLINK_FAILED: 解关联失败
     */
    public String getLinkState() {
        return this.LinkState;
    }

    /**
     * Set 关联状态，取值范围：
- LINKING: 关联中
- LINKED: 已关联
- UNLINKING: 解关联中
- LINK_FAILED: 关联失败
- UNLINK_FAILED: 解关联失败
     * @param LinkState 关联状态，取值范围：
- LINKING: 关联中
- LINKED: 已关联
- UNLINKING: 解关联中
- LINK_FAILED: 关联失败
- UNLINK_FAILED: 解关联失败
     */
    public void setLinkState(String LinkState) {
        this.LinkState = LinkState;
    }

    /**
     * Get 关联错误详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkErrorDetail 关联错误详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLinkErrorDetail() {
        return this.LinkErrorDetail;
    }

    /**
     * Set 关联错误详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkErrorDetail 关联错误详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinkErrorDetail(String LinkErrorDetail) {
        this.LinkErrorDetail = LinkErrorDetail;
    }

    public ClusterStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterStatus(ClusterStatus source) {
        if (source.LinkState != null) {
            this.LinkState = new String(source.LinkState);
        }
        if (source.LinkErrorDetail != null) {
            this.LinkErrorDetail = new String(source.LinkErrorDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LinkState", this.LinkState);
        this.setParamSimple(map, prefix + "LinkErrorDetail", this.LinkErrorDetail);

    }
}

