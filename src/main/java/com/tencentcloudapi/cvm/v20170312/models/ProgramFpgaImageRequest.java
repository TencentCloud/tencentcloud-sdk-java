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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProgramFpgaImageRequest extends AbstractModel{

    /**
    * 实例的ID信息。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * FPGA镜像文件的COS URL地址。
    */
    @SerializedName("FPGAUrl")
    @Expose
    private String FPGAUrl;

    /**
    * 实例上FPGA卡的DBDF号，不填默认烧录FPGA镜像到实例所拥有的所有FPGA卡。
    */
    @SerializedName("DBDFs")
    @Expose
    private String [] DBDFs;

    /**
    * 试运行，不会执行实际的烧录动作，默认为False。
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get 实例的ID信息。 
     * @return InstanceId 实例的ID信息。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例的ID信息。
     * @param InstanceId 实例的ID信息。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get FPGA镜像文件的COS URL地址。 
     * @return FPGAUrl FPGA镜像文件的COS URL地址。
     */
    public String getFPGAUrl() {
        return this.FPGAUrl;
    }

    /**
     * Set FPGA镜像文件的COS URL地址。
     * @param FPGAUrl FPGA镜像文件的COS URL地址。
     */
    public void setFPGAUrl(String FPGAUrl) {
        this.FPGAUrl = FPGAUrl;
    }

    /**
     * Get 实例上FPGA卡的DBDF号，不填默认烧录FPGA镜像到实例所拥有的所有FPGA卡。 
     * @return DBDFs 实例上FPGA卡的DBDF号，不填默认烧录FPGA镜像到实例所拥有的所有FPGA卡。
     */
    public String [] getDBDFs() {
        return this.DBDFs;
    }

    /**
     * Set 实例上FPGA卡的DBDF号，不填默认烧录FPGA镜像到实例所拥有的所有FPGA卡。
     * @param DBDFs 实例上FPGA卡的DBDF号，不填默认烧录FPGA镜像到实例所拥有的所有FPGA卡。
     */
    public void setDBDFs(String [] DBDFs) {
        this.DBDFs = DBDFs;
    }

    /**
     * Get 试运行，不会执行实际的烧录动作，默认为False。 
     * @return DryRun 试运行，不会执行实际的烧录动作，默认为False。
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 试运行，不会执行实际的烧录动作，默认为False。
     * @param DryRun 试运行，不会执行实际的烧录动作，默认为False。
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public ProgramFpgaImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProgramFpgaImageRequest(ProgramFpgaImageRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.FPGAUrl != null) {
            this.FPGAUrl = new String(source.FPGAUrl);
        }
        if (source.DBDFs != null) {
            this.DBDFs = new String[source.DBDFs.length];
            for (int i = 0; i < source.DBDFs.length; i++) {
                this.DBDFs[i] = new String(source.DBDFs[i]);
            }
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "FPGAUrl", this.FPGAUrl);
        this.setParamArraySimple(map, prefix + "DBDFs.", this.DBDFs);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

