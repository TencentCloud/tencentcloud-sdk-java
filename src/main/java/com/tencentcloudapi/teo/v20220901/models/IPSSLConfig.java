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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPSSLConfig extends AbstractModel {

    /**
    * IP SSL关联的域名。如果Status值为 unbound 时，该字段为空值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssociatedDomain")
    @Expose
    private String AssociatedDomain;

    /**
    * 关联状态， 取值如下：
<li>bound：IP SSL配置已绑定</li>
<li>binding：IP SSL配置绑定中</li>
<li>unbinding：IP SSL配置解绑中</li>
<li>unbound：IP SSL配置未绑定</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get IP SSL关联的域名。如果Status值为 unbound 时，该字段为空值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssociatedDomain IP SSL关联的域名。如果Status值为 unbound 时，该字段为空值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssociatedDomain() {
        return this.AssociatedDomain;
    }

    /**
     * Set IP SSL关联的域名。如果Status值为 unbound 时，该字段为空值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssociatedDomain IP SSL关联的域名。如果Status值为 unbound 时，该字段为空值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssociatedDomain(String AssociatedDomain) {
        this.AssociatedDomain = AssociatedDomain;
    }

    /**
     * Get 关联状态， 取值如下：
<li>bound：IP SSL配置已绑定</li>
<li>binding：IP SSL配置绑定中</li>
<li>unbinding：IP SSL配置解绑中</li>
<li>unbound：IP SSL配置未绑定</li> 
     * @return Status 关联状态， 取值如下：
<li>bound：IP SSL配置已绑定</li>
<li>binding：IP SSL配置绑定中</li>
<li>unbinding：IP SSL配置解绑中</li>
<li>unbound：IP SSL配置未绑定</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 关联状态， 取值如下：
<li>bound：IP SSL配置已绑定</li>
<li>binding：IP SSL配置绑定中</li>
<li>unbinding：IP SSL配置解绑中</li>
<li>unbound：IP SSL配置未绑定</li>
     * @param Status 关联状态， 取值如下：
<li>bound：IP SSL配置已绑定</li>
<li>binding：IP SSL配置绑定中</li>
<li>unbinding：IP SSL配置解绑中</li>
<li>unbound：IP SSL配置未绑定</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public IPSSLConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPSSLConfig(IPSSLConfig source) {
        if (source.AssociatedDomain != null) {
            this.AssociatedDomain = new String(source.AssociatedDomain);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssociatedDomain", this.AssociatedDomain);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

