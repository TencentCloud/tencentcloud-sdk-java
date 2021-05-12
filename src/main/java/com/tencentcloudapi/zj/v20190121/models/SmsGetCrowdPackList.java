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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsGetCrowdPackList extends AbstractModel{

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 人群包id
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 人群包名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 人群包状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 人群包手机号数量
    */
    @SerializedName("PhoneNum")
    @Expose
    private Long PhoneNum;

    /**
    * 人群包标签信息
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 人群包md5
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

    /**
    * 人群包文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 人群包描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 人群包id 
     * @return ID 人群包id
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 人群包id
     * @param ID 人群包id
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 人群包名称 
     * @return Name 人群包名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 人群包名称
     * @param Name 人群包名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 人群包状态 
     * @return Status 人群包状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 人群包状态
     * @param Status 人群包状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 人群包手机号数量 
     * @return PhoneNum 人群包手机号数量
     */
    public Long getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set 人群包手机号数量
     * @param PhoneNum 人群包手机号数量
     */
    public void setPhoneNum(Long PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get 人群包标签信息 
     * @return Tag 人群包标签信息
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 人群包标签信息
     * @param Tag 人群包标签信息
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 人群包md5 
     * @return MD5 人群包md5
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set 人群包md5
     * @param MD5 人群包md5
     */
    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    /**
     * Get 人群包文件名称 
     * @return FileName 人群包文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 人群包文件名称
     * @param FileName 人群包文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 人群包描述 
     * @return Desc 人群包描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 人群包描述
     * @param Desc 人群包描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public SmsGetCrowdPackList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmsGetCrowdPackList(SmsGetCrowdPackList source) {
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.PhoneNum != null) {
            this.PhoneNum = new Long(source.PhoneNum);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.MD5 != null) {
            this.MD5 = new String(source.MD5);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "MD5", this.MD5);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

