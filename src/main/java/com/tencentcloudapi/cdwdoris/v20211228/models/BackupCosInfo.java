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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupCosInfo extends AbstractModel {

    /**
    * 备份文件所在的cos桶
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * 备份文件所在的完整cos路径
    */
    @SerializedName("CosPath")
    @Expose
    private String CosPath;

    /**
    * 备份文件名称
    */
    @SerializedName("SnapShotPath")
    @Expose
    private String SnapShotPath;

    /**
    * cos桶所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 备份文件所在的cos桶 
     * @return CosBucket 备份文件所在的cos桶
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set 备份文件所在的cos桶
     * @param CosBucket 备份文件所在的cos桶
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get 备份文件所在的完整cos路径 
     * @return CosPath 备份文件所在的完整cos路径
     */
    public String getCosPath() {
        return this.CosPath;
    }

    /**
     * Set 备份文件所在的完整cos路径
     * @param CosPath 备份文件所在的完整cos路径
     */
    public void setCosPath(String CosPath) {
        this.CosPath = CosPath;
    }

    /**
     * Get 备份文件名称 
     * @return SnapShotPath 备份文件名称
     */
    public String getSnapShotPath() {
        return this.SnapShotPath;
    }

    /**
     * Set 备份文件名称
     * @param SnapShotPath 备份文件名称
     */
    public void setSnapShotPath(String SnapShotPath) {
        this.SnapShotPath = SnapShotPath;
    }

    /**
     * Get cos桶所在地域 
     * @return Region cos桶所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set cos桶所在地域
     * @param Region cos桶所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public BackupCosInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupCosInfo(BackupCosInfo source) {
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.CosPath != null) {
            this.CosPath = new String(source.CosPath);
        }
        if (source.SnapShotPath != null) {
            this.SnapShotPath = new String(source.SnapShotPath);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "CosPath", this.CosPath);
        this.setParamSimple(map, prefix + "SnapShotPath", this.SnapShotPath);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

