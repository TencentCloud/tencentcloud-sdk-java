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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VersionReplicaItem extends AbstractModel {

    /**
    * 版本描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplicaFlag")
    @Expose
    private Long ReplicaFlag;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
     * Get 版本描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplicaFlag 版本描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplicaFlag() {
        return this.ReplicaFlag;
    }

    /**
     * Set 版本描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplicaFlag 版本描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicaFlag(Long ReplicaFlag) {
        this.ReplicaFlag = ReplicaFlag;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    public VersionReplicaItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VersionReplicaItem(VersionReplicaItem source) {
        if (source.ReplicaFlag != null) {
            this.ReplicaFlag = new Long(source.ReplicaFlag);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicaFlag", this.ReplicaFlag);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);

    }
}

