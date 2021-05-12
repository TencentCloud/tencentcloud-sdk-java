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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteProxyGroupRequest extends AbstractModel{

    /**
    * 需要删除的通道组ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 强制删除标识。其中：
0，不强制删除，
1，强制删除。
默认为0，当通道组中存在通道或通道组中存在监听器/规则绑定了源站时，且Force为0时，该操作会返回失败。
    */
    @SerializedName("Force")
    @Expose
    private Long Force;

    /**
     * Get 需要删除的通道组ID。 
     * @return GroupId 需要删除的通道组ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 需要删除的通道组ID。
     * @param GroupId 需要删除的通道组ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 强制删除标识。其中：
0，不强制删除，
1，强制删除。
默认为0，当通道组中存在通道或通道组中存在监听器/规则绑定了源站时，且Force为0时，该操作会返回失败。 
     * @return Force 强制删除标识。其中：
0，不强制删除，
1，强制删除。
默认为0，当通道组中存在通道或通道组中存在监听器/规则绑定了源站时，且Force为0时，该操作会返回失败。
     */
    public Long getForce() {
        return this.Force;
    }

    /**
     * Set 强制删除标识。其中：
0，不强制删除，
1，强制删除。
默认为0，当通道组中存在通道或通道组中存在监听器/规则绑定了源站时，且Force为0时，该操作会返回失败。
     * @param Force 强制删除标识。其中：
0，不强制删除，
1，强制删除。
默认为0，当通道组中存在通道或通道组中存在监听器/规则绑定了源站时，且Force为0时，该操作会返回失败。
     */
    public void setForce(Long Force) {
        this.Force = Force;
    }

    public DeleteProxyGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteProxyGroupRequest(DeleteProxyGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Force != null) {
            this.Force = new Long(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

