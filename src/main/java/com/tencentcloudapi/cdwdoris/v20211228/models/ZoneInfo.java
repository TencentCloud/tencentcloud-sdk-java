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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel {

    /**
    * 可用区名称，例如"ap-guangzhou-1"
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 可用区描述信息，例如“广州一区”
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 可用区唯一标记
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Encryptid
    */
    @SerializedName("Encrypt")
    @Expose
    private Long Encrypt;

    /**
    * 是否为主力园区
    */
    @SerializedName("Main")
    @Expose
    private Boolean Main;

    /**
    * 0表示未开通容器化，1表示已开通容器化
    */
    @SerializedName("ContainerEnabled")
    @Expose
    private Long ContainerEnabled;

    /**
     * Get 可用区名称，例如"ap-guangzhou-1" 
     * @return Name 可用区名称，例如"ap-guangzhou-1"
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 可用区名称，例如"ap-guangzhou-1"
     * @param Name 可用区名称，例如"ap-guangzhou-1"
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 可用区描述信息，例如“广州一区” 
     * @return Desc 可用区描述信息，例如“广州一区”
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 可用区描述信息，例如“广州一区”
     * @param Desc 可用区描述信息，例如“广州一区”
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 可用区唯一标记 
     * @return ZoneId 可用区唯一标记
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区唯一标记
     * @param ZoneId 可用区唯一标记
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Encryptid 
     * @return Encrypt Encryptid
     */
    public Long getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set Encryptid
     * @param Encrypt Encryptid
     */
    public void setEncrypt(Long Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get 是否为主力园区 
     * @return Main 是否为主力园区
     */
    public Boolean getMain() {
        return this.Main;
    }

    /**
     * Set 是否为主力园区
     * @param Main 是否为主力园区
     */
    public void setMain(Boolean Main) {
        this.Main = Main;
    }

    /**
     * Get 0表示未开通容器化，1表示已开通容器化 
     * @return ContainerEnabled 0表示未开通容器化，1表示已开通容器化
     */
    public Long getContainerEnabled() {
        return this.ContainerEnabled;
    }

    /**
     * Set 0表示未开通容器化，1表示已开通容器化
     * @param ContainerEnabled 0表示未开通容器化，1表示已开通容器化
     */
    public void setContainerEnabled(Long ContainerEnabled) {
        this.ContainerEnabled = ContainerEnabled;
    }

    public ZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneInfo(ZoneInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new Long(source.Encrypt);
        }
        if (source.Main != null) {
            this.Main = new Boolean(source.Main);
        }
        if (source.ContainerEnabled != null) {
            this.ContainerEnabled = new Long(source.ContainerEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "Main", this.Main);
        this.setParamSimple(map, prefix + "ContainerEnabled", this.ContainerEnabled);

    }
}

