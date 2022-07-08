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
package com.tencentcloudapi.iotvideo.v20211125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceCntStats extends AbstractModel{

    /**
    * 统计日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 新增注册设备数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewRegisterCnt")
    @Expose
    private Long NewRegisterCnt;

    /**
    * 新增激活设备数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewActivateCnt")
    @Expose
    private Long NewActivateCnt;

    /**
    * 活跃设备数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActiveCnt")
    @Expose
    private Long ActiveCnt;

    /**
     * Get 统计日期 
     * @return Date 统计日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 统计日期
     * @param Date 统计日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 新增注册设备数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewRegisterCnt 新增注册设备数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNewRegisterCnt() {
        return this.NewRegisterCnt;
    }

    /**
     * Set 新增注册设备数
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewRegisterCnt 新增注册设备数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewRegisterCnt(Long NewRegisterCnt) {
        this.NewRegisterCnt = NewRegisterCnt;
    }

    /**
     * Get 新增激活设备数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewActivateCnt 新增激活设备数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNewActivateCnt() {
        return this.NewActivateCnt;
    }

    /**
     * Set 新增激活设备数
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewActivateCnt 新增激活设备数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewActivateCnt(Long NewActivateCnt) {
        this.NewActivateCnt = NewActivateCnt;
    }

    /**
     * Get 活跃设备数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActiveCnt 活跃设备数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActiveCnt() {
        return this.ActiveCnt;
    }

    /**
     * Set 活跃设备数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActiveCnt 活跃设备数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActiveCnt(Long ActiveCnt) {
        this.ActiveCnt = ActiveCnt;
    }

    public DeviceCntStats() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceCntStats(DeviceCntStats source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.NewRegisterCnt != null) {
            this.NewRegisterCnt = new Long(source.NewRegisterCnt);
        }
        if (source.NewActivateCnt != null) {
            this.NewActivateCnt = new Long(source.NewActivateCnt);
        }
        if (source.ActiveCnt != null) {
            this.ActiveCnt = new Long(source.ActiveCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "NewRegisterCnt", this.NewRegisterCnt);
        this.setParamSimple(map, prefix + "NewActivateCnt", this.NewActivateCnt);
        this.setParamSimple(map, prefix + "ActiveCnt", this.ActiveCnt);

    }
}

