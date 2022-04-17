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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpAccessControlItem extends AbstractModel{

    /**
    * 动作
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 备注
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * 来源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 更新时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TsVersion")
    @Expose
    private Long TsVersion;

    /**
    * 有效截止时间戳
    */
    @SerializedName("ValidTs")
    @Expose
    private Long ValidTs;

    /**
     * Get 动作 
     * @return ActionType 动作
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set 动作
     * @param ActionType 动作
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get ip 
     * @return Ip ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set ip
     * @param Ip ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 备注 
     * @return Note 备注
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 备注
     * @param Note 备注
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get 来源 
     * @return Source 来源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源
     * @param Source 来源
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 更新时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TsVersion 更新时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTsVersion() {
        return this.TsVersion;
    }

    /**
     * Set 更新时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param TsVersion 更新时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTsVersion(Long TsVersion) {
        this.TsVersion = TsVersion;
    }

    /**
     * Get 有效截止时间戳 
     * @return ValidTs 有效截止时间戳
     */
    public Long getValidTs() {
        return this.ValidTs;
    }

    /**
     * Set 有效截止时间戳
     * @param ValidTs 有效截止时间戳
     */
    public void setValidTs(Long ValidTs) {
        this.ValidTs = ValidTs;
    }

    public IpAccessControlItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpAccessControlItem(IpAccessControlItem source) {
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.TsVersion != null) {
            this.TsVersion = new Long(source.TsVersion);
        }
        if (source.ValidTs != null) {
            this.ValidTs = new Long(source.ValidTs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "TsVersion", this.TsVersion);
        this.setParamSimple(map, prefix + "ValidTs", this.ValidTs);

    }
}

