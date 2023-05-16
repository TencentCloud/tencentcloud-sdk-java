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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LicenseBindTaskDetail extends AbstractModel{

    /**
    * 云服务器UUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 错误信息
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 0 执行中, 1 成功,2失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 修复建议
    */
    @SerializedName("FixMessage")
    @Expose
    private String FixMessage;

    /**
    * 机器额外信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get 云服务器UUID 
     * @return Quuid 云服务器UUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 云服务器UUID
     * @param Quuid 云服务器UUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 错误信息 
     * @return ErrMsg 错误信息
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 错误信息
     * @param ErrMsg 错误信息
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 0 执行中, 1 成功,2失败 
     * @return Status 0 执行中, 1 成功,2失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0 执行中, 1 成功,2失败
     * @param Status 0 执行中, 1 成功,2失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 修复建议 
     * @return FixMessage 修复建议
     */
    public String getFixMessage() {
        return this.FixMessage;
    }

    /**
     * Set 修复建议
     * @param FixMessage 修复建议
     */
    public void setFixMessage(String FixMessage) {
        this.FixMessage = FixMessage;
    }

    /**
     * Get 机器额外信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineExtraInfo 机器额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set 机器额外信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineExtraInfo 机器额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public LicenseBindTaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseBindTaskDetail(LicenseBindTaskDetail source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FixMessage != null) {
            this.FixMessage = new String(source.FixMessage);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FixMessage", this.FixMessage);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

