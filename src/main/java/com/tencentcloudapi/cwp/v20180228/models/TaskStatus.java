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

public class TaskStatus extends AbstractModel{

    /**
    * 扫描中（包含初始化）
    */
    @SerializedName("Scanning")
    @Expose
    private String Scanning;

    /**
    * 扫描终止（包含终止中）
    */
    @SerializedName("Ok")
    @Expose
    private String Ok;

    /**
    * 扫描失败
    */
    @SerializedName("Fail")
    @Expose
    private String Fail;

    /**
    * 扫描失败（提示具体原因：扫描超时、客户端版本低、客户端离线）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Stop")
    @Expose
    private String Stop;

    /**
     * Get 扫描中（包含初始化） 
     * @return Scanning 扫描中（包含初始化）
     */
    public String getScanning() {
        return this.Scanning;
    }

    /**
     * Set 扫描中（包含初始化）
     * @param Scanning 扫描中（包含初始化）
     */
    public void setScanning(String Scanning) {
        this.Scanning = Scanning;
    }

    /**
     * Get 扫描终止（包含终止中） 
     * @return Ok 扫描终止（包含终止中）
     */
    public String getOk() {
        return this.Ok;
    }

    /**
     * Set 扫描终止（包含终止中）
     * @param Ok 扫描终止（包含终止中）
     */
    public void setOk(String Ok) {
        this.Ok = Ok;
    }

    /**
     * Get 扫描失败 
     * @return Fail 扫描失败
     */
    public String getFail() {
        return this.Fail;
    }

    /**
     * Set 扫描失败
     * @param Fail 扫描失败
     */
    public void setFail(String Fail) {
        this.Fail = Fail;
    }

    /**
     * Get 扫描失败（提示具体原因：扫描超时、客户端版本低、客户端离线）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Stop 扫描失败（提示具体原因：扫描超时、客户端版本低、客户端离线）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStop() {
        return this.Stop;
    }

    /**
     * Set 扫描失败（提示具体原因：扫描超时、客户端版本低、客户端离线）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Stop 扫描失败（提示具体原因：扫描超时、客户端版本低、客户端离线）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStop(String Stop) {
        this.Stop = Stop;
    }

    public TaskStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskStatus(TaskStatus source) {
        if (source.Scanning != null) {
            this.Scanning = new String(source.Scanning);
        }
        if (source.Ok != null) {
            this.Ok = new String(source.Ok);
        }
        if (source.Fail != null) {
            this.Fail = new String(source.Fail);
        }
        if (source.Stop != null) {
            this.Stop = new String(source.Stop);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scanning", this.Scanning);
        this.setParamSimple(map, prefix + "Ok", this.Ok);
        this.setParamSimple(map, prefix + "Fail", this.Fail);
        this.setParamSimple(map, prefix + "Stop", this.Stop);

    }
}

