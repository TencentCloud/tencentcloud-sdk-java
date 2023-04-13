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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupLimitVpcItem extends AbstractModel{

    /**
    * 备份文件的下载地址对应VPC 所属的地域。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 备份文件下载地址的 VPC 列表。
    */
    @SerializedName("VpcList")
    @Expose
    private String [] VpcList;

    /**
     * Get 备份文件的下载地址对应VPC 所属的地域。 
     * @return Region 备份文件的下载地址对应VPC 所属的地域。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 备份文件的下载地址对应VPC 所属的地域。
     * @param Region 备份文件的下载地址对应VPC 所属的地域。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 备份文件下载地址的 VPC 列表。 
     * @return VpcList 备份文件下载地址的 VPC 列表。
     */
    public String [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set 备份文件下载地址的 VPC 列表。
     * @param VpcList 备份文件下载地址的 VPC 列表。
     */
    public void setVpcList(String [] VpcList) {
        this.VpcList = VpcList;
    }

    public BackupLimitVpcItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupLimitVpcItem(BackupLimitVpcItem source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcList != null) {
            this.VpcList = new String[source.VpcList.length];
            for (int i = 0; i < source.VpcList.length; i++) {
                this.VpcList[i] = new String(source.VpcList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArraySimple(map, prefix + "VpcList.", this.VpcList);

    }
}

