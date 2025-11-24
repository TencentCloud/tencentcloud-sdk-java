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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IncCompareAbstractInfo extends AbstractModel {

    /**
    * 增量起始位点
    */
    @SerializedName("StartPosition")
    @Expose
    private String StartPosition;

    /**
    * 增量当前位点
    */
    @SerializedName("CurrentPosition")
    @Expose
    private String CurrentPosition;

    /**
    * 已校验行数
    */
    @SerializedName("CheckedRecord")
    @Expose
    private Long CheckedRecord;

    /**
    * 不一致行数
    */
    @SerializedName("DiffRecord")
    @Expose
    private Long DiffRecord;

    /**
    * 不一致表的数量
    */
    @SerializedName("DiffTable")
    @Expose
    private Long DiffTable;

    /**
     * Get 增量起始位点 
     * @return StartPosition 增量起始位点
     */
    public String getStartPosition() {
        return this.StartPosition;
    }

    /**
     * Set 增量起始位点
     * @param StartPosition 增量起始位点
     */
    public void setStartPosition(String StartPosition) {
        this.StartPosition = StartPosition;
    }

    /**
     * Get 增量当前位点 
     * @return CurrentPosition 增量当前位点
     */
    public String getCurrentPosition() {
        return this.CurrentPosition;
    }

    /**
     * Set 增量当前位点
     * @param CurrentPosition 增量当前位点
     */
    public void setCurrentPosition(String CurrentPosition) {
        this.CurrentPosition = CurrentPosition;
    }

    /**
     * Get 已校验行数 
     * @return CheckedRecord 已校验行数
     */
    public Long getCheckedRecord() {
        return this.CheckedRecord;
    }

    /**
     * Set 已校验行数
     * @param CheckedRecord 已校验行数
     */
    public void setCheckedRecord(Long CheckedRecord) {
        this.CheckedRecord = CheckedRecord;
    }

    /**
     * Get 不一致行数 
     * @return DiffRecord 不一致行数
     */
    public Long getDiffRecord() {
        return this.DiffRecord;
    }

    /**
     * Set 不一致行数
     * @param DiffRecord 不一致行数
     */
    public void setDiffRecord(Long DiffRecord) {
        this.DiffRecord = DiffRecord;
    }

    /**
     * Get 不一致表的数量 
     * @return DiffTable 不一致表的数量
     */
    public Long getDiffTable() {
        return this.DiffTable;
    }

    /**
     * Set 不一致表的数量
     * @param DiffTable 不一致表的数量
     */
    public void setDiffTable(Long DiffTable) {
        this.DiffTable = DiffTable;
    }

    public IncCompareAbstractInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncCompareAbstractInfo(IncCompareAbstractInfo source) {
        if (source.StartPosition != null) {
            this.StartPosition = new String(source.StartPosition);
        }
        if (source.CurrentPosition != null) {
            this.CurrentPosition = new String(source.CurrentPosition);
        }
        if (source.CheckedRecord != null) {
            this.CheckedRecord = new Long(source.CheckedRecord);
        }
        if (source.DiffRecord != null) {
            this.DiffRecord = new Long(source.DiffRecord);
        }
        if (source.DiffTable != null) {
            this.DiffTable = new Long(source.DiffTable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartPosition", this.StartPosition);
        this.setParamSimple(map, prefix + "CurrentPosition", this.CurrentPosition);
        this.setParamSimple(map, prefix + "CheckedRecord", this.CheckedRecord);
        this.setParamSimple(map, prefix + "DiffRecord", this.DiffRecord);
        this.setParamSimple(map, prefix + "DiffTable", this.DiffTable);

    }
}

