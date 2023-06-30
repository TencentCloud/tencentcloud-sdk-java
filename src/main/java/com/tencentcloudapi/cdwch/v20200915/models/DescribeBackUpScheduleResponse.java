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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackUpScheduleResponse extends AbstractModel{

    /**
    * 备份是否开启
    */
    @SerializedName("BackUpOpened")
    @Expose
    private Boolean BackUpOpened;

    /**
    * 元数据备份策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaStrategy")
    @Expose
    private ScheduleStrategy MetaStrategy;

    /**
    * 表数据备份策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataStrategy")
    @Expose
    private ScheduleStrategy DataStrategy;

    /**
    * 备份表列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackUpContents")
    @Expose
    private BackupTableContent [] BackUpContents;

    /**
    * 备份的状态
    */
    @SerializedName("BackUpStatus")
    @Expose
    private Long BackUpStatus;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 备份是否开启 
     * @return BackUpOpened 备份是否开启
     */
    public Boolean getBackUpOpened() {
        return this.BackUpOpened;
    }

    /**
     * Set 备份是否开启
     * @param BackUpOpened 备份是否开启
     */
    public void setBackUpOpened(Boolean BackUpOpened) {
        this.BackUpOpened = BackUpOpened;
    }

    /**
     * Get 元数据备份策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaStrategy 元数据备份策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduleStrategy getMetaStrategy() {
        return this.MetaStrategy;
    }

    /**
     * Set 元数据备份策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaStrategy 元数据备份策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaStrategy(ScheduleStrategy MetaStrategy) {
        this.MetaStrategy = MetaStrategy;
    }

    /**
     * Get 表数据备份策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataStrategy 表数据备份策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduleStrategy getDataStrategy() {
        return this.DataStrategy;
    }

    /**
     * Set 表数据备份策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataStrategy 表数据备份策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataStrategy(ScheduleStrategy DataStrategy) {
        this.DataStrategy = DataStrategy;
    }

    /**
     * Get 备份表列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackUpContents 备份表列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackupTableContent [] getBackUpContents() {
        return this.BackUpContents;
    }

    /**
     * Set 备份表列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackUpContents 备份表列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackUpContents(BackupTableContent [] BackUpContents) {
        this.BackUpContents = BackUpContents;
    }

    /**
     * Get 备份的状态 
     * @return BackUpStatus 备份的状态
     */
    public Long getBackUpStatus() {
        return this.BackUpStatus;
    }

    /**
     * Set 备份的状态
     * @param BackUpStatus 备份的状态
     */
    public void setBackUpStatus(Long BackUpStatus) {
        this.BackUpStatus = BackUpStatus;
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

    public DescribeBackUpScheduleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackUpScheduleResponse(DescribeBackUpScheduleResponse source) {
        if (source.BackUpOpened != null) {
            this.BackUpOpened = new Boolean(source.BackUpOpened);
        }
        if (source.MetaStrategy != null) {
            this.MetaStrategy = new ScheduleStrategy(source.MetaStrategy);
        }
        if (source.DataStrategy != null) {
            this.DataStrategy = new ScheduleStrategy(source.DataStrategy);
        }
        if (source.BackUpContents != null) {
            this.BackUpContents = new BackupTableContent[source.BackUpContents.length];
            for (int i = 0; i < source.BackUpContents.length; i++) {
                this.BackUpContents[i] = new BackupTableContent(source.BackUpContents[i]);
            }
        }
        if (source.BackUpStatus != null) {
            this.BackUpStatus = new Long(source.BackUpStatus);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackUpOpened", this.BackUpOpened);
        this.setParamObj(map, prefix + "MetaStrategy.", this.MetaStrategy);
        this.setParamObj(map, prefix + "DataStrategy.", this.DataStrategy);
        this.setParamArrayObj(map, prefix + "BackUpContents.", this.BackUpContents);
        this.setParamSimple(map, prefix + "BackUpStatus", this.BackUpStatus);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

