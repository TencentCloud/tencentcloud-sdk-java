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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLabelGroupInfo extends AbstractModel {

    /**
    * <p>标签组中文名。</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>标签组英文名。</p>
    */
    @SerializedName("GroupEname")
    @Expose
    private String GroupEname;

    /**
    * <p>标签组描述。</p>
    */
    @SerializedName("GroupMsg")
    @Expose
    private String GroupMsg;

    /**
     * Get <p>标签组中文名。</p> 
     * @return GroupName <p>标签组中文名。</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>标签组中文名。</p>
     * @param GroupName <p>标签组中文名。</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>标签组英文名。</p> 
     * @return GroupEname <p>标签组英文名。</p>
     */
    public String getGroupEname() {
        return this.GroupEname;
    }

    /**
     * Set <p>标签组英文名。</p>
     * @param GroupEname <p>标签组英文名。</p>
     */
    public void setGroupEname(String GroupEname) {
        this.GroupEname = GroupEname;
    }

    /**
     * Get <p>标签组描述。</p> 
     * @return GroupMsg <p>标签组描述。</p>
     */
    public String getGroupMsg() {
        return this.GroupMsg;
    }

    /**
     * Set <p>标签组描述。</p>
     * @param GroupMsg <p>标签组描述。</p>
     */
    public void setGroupMsg(String GroupMsg) {
        this.GroupMsg = GroupMsg;
    }

    public AuditLabelGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLabelGroupInfo(AuditLabelGroupInfo source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupEname != null) {
            this.GroupEname = new String(source.GroupEname);
        }
        if (source.GroupMsg != null) {
            this.GroupMsg = new String(source.GroupMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupEname", this.GroupEname);
        this.setParamSimple(map, prefix + "GroupMsg", this.GroupMsg);

    }
}

