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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMetaTableRequest extends AbstractModel {

    /**
    * <p>集群唯一id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>元数据表唯一id</p>
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * <p>SQL</p><p>参数格式：base64加密</p>
    */
    @SerializedName("SqlCode")
    @Expose
    private String SqlCode;

    /**
    * <p>Flink版本</p>
    */
    @SerializedName("FlinkVersion")
    @Expose
    private String FlinkVersion;

    /**
    * <p>空间唯一id</p>
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get <p>集群唯一id</p> 
     * @return ClusterId <p>集群唯一id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群唯一id</p>
     * @param ClusterId <p>集群唯一id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>元数据表唯一id</p> 
     * @return TableId <p>元数据表唯一id</p>
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set <p>元数据表唯一id</p>
     * @param TableId <p>元数据表唯一id</p>
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get <p>SQL</p><p>参数格式：base64加密</p> 
     * @return SqlCode <p>SQL</p><p>参数格式：base64加密</p>
     */
    public String getSqlCode() {
        return this.SqlCode;
    }

    /**
     * Set <p>SQL</p><p>参数格式：base64加密</p>
     * @param SqlCode <p>SQL</p><p>参数格式：base64加密</p>
     */
    public void setSqlCode(String SqlCode) {
        this.SqlCode = SqlCode;
    }

    /**
     * Get <p>Flink版本</p> 
     * @return FlinkVersion <p>Flink版本</p>
     */
    public String getFlinkVersion() {
        return this.FlinkVersion;
    }

    /**
     * Set <p>Flink版本</p>
     * @param FlinkVersion <p>Flink版本</p>
     */
    public void setFlinkVersion(String FlinkVersion) {
        this.FlinkVersion = FlinkVersion;
    }

    /**
     * Get <p>空间唯一id</p> 
     * @return WorkSpaceId <p>空间唯一id</p>
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set <p>空间唯一id</p>
     * @param WorkSpaceId <p>空间唯一id</p>
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyMetaTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMetaTableRequest(ModifyMetaTableRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.SqlCode != null) {
            this.SqlCode = new String(source.SqlCode);
        }
        if (source.FlinkVersion != null) {
            this.FlinkVersion = new String(source.FlinkVersion);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "SqlCode", this.SqlCode);
        this.setParamSimple(map, prefix + "FlinkVersion", this.FlinkVersion);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

