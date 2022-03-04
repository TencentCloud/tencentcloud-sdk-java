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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryReconciliationFileApplyInfoResult extends AbstractModel{

    /**
    * 申请对账文件的任务ID。
    */
    @SerializedName("ApplyFileId")
    @Expose
    private String ApplyFileId;

    /**
    * 对账文件申请状态。
__I__：申请中
__S__：申请成功
__F__：申请失败
    */
    @SerializedName("ApplyStatus")
    @Expose
    private String ApplyStatus;

    /**
    * 申请结果描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplyMessage")
    @Expose
    private String ApplyMessage;

    /**
    * 对账文件下载地址列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileUrlArray")
    @Expose
    private String [] FileUrlArray;

    /**
     * Get 申请对账文件的任务ID。 
     * @return ApplyFileId 申请对账文件的任务ID。
     */
    public String getApplyFileId() {
        return this.ApplyFileId;
    }

    /**
     * Set 申请对账文件的任务ID。
     * @param ApplyFileId 申请对账文件的任务ID。
     */
    public void setApplyFileId(String ApplyFileId) {
        this.ApplyFileId = ApplyFileId;
    }

    /**
     * Get 对账文件申请状态。
__I__：申请中
__S__：申请成功
__F__：申请失败 
     * @return ApplyStatus 对账文件申请状态。
__I__：申请中
__S__：申请成功
__F__：申请失败
     */
    public String getApplyStatus() {
        return this.ApplyStatus;
    }

    /**
     * Set 对账文件申请状态。
__I__：申请中
__S__：申请成功
__F__：申请失败
     * @param ApplyStatus 对账文件申请状态。
__I__：申请中
__S__：申请成功
__F__：申请失败
     */
    public void setApplyStatus(String ApplyStatus) {
        this.ApplyStatus = ApplyStatus;
    }

    /**
     * Get 申请结果描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplyMessage 申请结果描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplyMessage() {
        return this.ApplyMessage;
    }

    /**
     * Set 申请结果描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplyMessage 申请结果描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplyMessage(String ApplyMessage) {
        this.ApplyMessage = ApplyMessage;
    }

    /**
     * Get 对账文件下载地址列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileUrlArray 对账文件下载地址列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFileUrlArray() {
        return this.FileUrlArray;
    }

    /**
     * Set 对账文件下载地址列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileUrlArray 对账文件下载地址列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileUrlArray(String [] FileUrlArray) {
        this.FileUrlArray = FileUrlArray;
    }

    public QueryReconciliationFileApplyInfoResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryReconciliationFileApplyInfoResult(QueryReconciliationFileApplyInfoResult source) {
        if (source.ApplyFileId != null) {
            this.ApplyFileId = new String(source.ApplyFileId);
        }
        if (source.ApplyStatus != null) {
            this.ApplyStatus = new String(source.ApplyStatus);
        }
        if (source.ApplyMessage != null) {
            this.ApplyMessage = new String(source.ApplyMessage);
        }
        if (source.FileUrlArray != null) {
            this.FileUrlArray = new String[source.FileUrlArray.length];
            for (int i = 0; i < source.FileUrlArray.length; i++) {
                this.FileUrlArray[i] = new String(source.FileUrlArray[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplyFileId", this.ApplyFileId);
        this.setParamSimple(map, prefix + "ApplyStatus", this.ApplyStatus);
        this.setParamSimple(map, prefix + "ApplyMessage", this.ApplyMessage);
        this.setParamArraySimple(map, prefix + "FileUrlArray.", this.FileUrlArray);

    }
}

