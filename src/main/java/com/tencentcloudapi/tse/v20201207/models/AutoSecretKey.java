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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoSecretKey extends AbstractModel {

    /**
    * <p>密钥名称，2-60 字符。</p><p>字符集与「密钥管理-新建密钥」一致（中英文、数字、下划线、短横线），禁止 -share 后缀，同网关内不可重名。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>密钥描述。长度 ≤ 200，可为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>密钥名称，2-60 字符。</p><p>字符集与「密钥管理-新建密钥」一致（中英文、数字、下划线、短横线），禁止 -share 后缀，同网关内不可重名。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>密钥名称，2-60 字符。</p><p>字符集与「密钥管理-新建密钥」一致（中英文、数字、下划线、短横线），禁止 -share 后缀，同网关内不可重名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>密钥名称，2-60 字符。</p><p>字符集与「密钥管理-新建密钥」一致（中英文、数字、下划线、短横线），禁止 -share 后缀，同网关内不可重名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>密钥名称，2-60 字符。</p><p>字符集与「密钥管理-新建密钥」一致（中英文、数字、下划线、短横线），禁止 -share 后缀，同网关内不可重名。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>密钥描述。长度 ≤ 200，可为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>密钥描述。长度 ≤ 200，可为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>密钥描述。长度 ≤ 200，可为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>密钥描述。长度 ≤ 200，可为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public AutoSecretKey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoSecretKey(AutoSecretKey source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

