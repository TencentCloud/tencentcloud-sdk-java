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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteIntegrationTaskResponse extends AbstractModel{

    /**
    * 任务删除成功与否标识
    */
    @SerializedName("Data")
    @Expose
    private Boolean Data;

    /**
    * 任务删除成功与否标识
0表示删除成功
1 表示失败，失败原因见 DeleteErrInfo
100 表示running or suspend task can't be deleted失败，失败原因也会写到DeleteErrInfo里面
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteFlag")
    @Expose
    private Long DeleteFlag;

    /**
    * 删除失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteErrInfo")
    @Expose
    private String DeleteErrInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务删除成功与否标识 
     * @return Data 任务删除成功与否标识
     */
    public Boolean getData() {
        return this.Data;
    }

    /**
     * Set 任务删除成功与否标识
     * @param Data 任务删除成功与否标识
     */
    public void setData(Boolean Data) {
        this.Data = Data;
    }

    /**
     * Get 任务删除成功与否标识
0表示删除成功
1 表示失败，失败原因见 DeleteErrInfo
100 表示running or suspend task can't be deleted失败，失败原因也会写到DeleteErrInfo里面
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeleteFlag 任务删除成功与否标识
0表示删除成功
1 表示失败，失败原因见 DeleteErrInfo
100 表示running or suspend task can't be deleted失败，失败原因也会写到DeleteErrInfo里面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeleteFlag() {
        return this.DeleteFlag;
    }

    /**
     * Set 任务删除成功与否标识
0表示删除成功
1 表示失败，失败原因见 DeleteErrInfo
100 表示running or suspend task can't be deleted失败，失败原因也会写到DeleteErrInfo里面
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteFlag 任务删除成功与否标识
0表示删除成功
1 表示失败，失败原因见 DeleteErrInfo
100 表示running or suspend task can't be deleted失败，失败原因也会写到DeleteErrInfo里面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteFlag(Long DeleteFlag) {
        this.DeleteFlag = DeleteFlag;
    }

    /**
     * Get 删除失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeleteErrInfo 删除失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeleteErrInfo() {
        return this.DeleteErrInfo;
    }

    /**
     * Set 删除失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteErrInfo 删除失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteErrInfo(String DeleteErrInfo) {
        this.DeleteErrInfo = DeleteErrInfo;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DeleteIntegrationTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteIntegrationTaskResponse(DeleteIntegrationTaskResponse source) {
        if (source.Data != null) {
            this.Data = new Boolean(source.Data);
        }
        if (source.DeleteFlag != null) {
            this.DeleteFlag = new Long(source.DeleteFlag);
        }
        if (source.DeleteErrInfo != null) {
            this.DeleteErrInfo = new String(source.DeleteErrInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "DeleteFlag", this.DeleteFlag);
        this.setParamSimple(map, prefix + "DeleteErrInfo", this.DeleteErrInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

