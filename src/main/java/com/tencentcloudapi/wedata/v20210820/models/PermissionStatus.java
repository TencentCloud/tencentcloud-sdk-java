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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PermissionStatus extends AbstractModel {

    /**
    * 写权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanWrite")
    @Expose
    private Boolean CanWrite;

    /**
    * 写权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanDelete")
    @Expose
    private Boolean CanDelete;

    /**
    * 写权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanRead")
    @Expose
    private Boolean CanRead;

    /**
     * Get 写权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanWrite 写权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanWrite() {
        return this.CanWrite;
    }

    /**
     * Set 写权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanWrite 写权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanWrite(Boolean CanWrite) {
        this.CanWrite = CanWrite;
    }

    /**
     * Get 写权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanDelete 写权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanDelete() {
        return this.CanDelete;
    }

    /**
     * Set 写权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanDelete 写权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanDelete(Boolean CanDelete) {
        this.CanDelete = CanDelete;
    }

    /**
     * Get 写权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanRead 写权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanRead() {
        return this.CanRead;
    }

    /**
     * Set 写权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanRead 写权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanRead(Boolean CanRead) {
        this.CanRead = CanRead;
    }

    public PermissionStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PermissionStatus(PermissionStatus source) {
        if (source.CanWrite != null) {
            this.CanWrite = new Boolean(source.CanWrite);
        }
        if (source.CanDelete != null) {
            this.CanDelete = new Boolean(source.CanDelete);
        }
        if (source.CanRead != null) {
            this.CanRead = new Boolean(source.CanRead);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanWrite", this.CanWrite);
        this.setParamSimple(map, prefix + "CanDelete", this.CanDelete);
        this.setParamSimple(map, prefix + "CanRead", this.CanRead);

    }
}

