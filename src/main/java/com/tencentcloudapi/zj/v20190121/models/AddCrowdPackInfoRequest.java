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

public class AddCrowdPackInfoRequest extends AbstractModel{

    /**
    * 商户证书
    */
    @SerializedName("License")
    @Expose
    private String License;

    /**
    * 人群包名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 人群包文件名称,人群包文件必须为utf8编码，动态参数只能是汉字、数字、英文字母的组合，不能包含其他字符
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
    * 已经上传好的人群包cos地址
    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
    * 人群包手机号数量
    */
    @SerializedName("PhoneNum")
    @Expose
    private Long PhoneNum;

    /**
     * Get 商户证书 
     * @return License 商户证书
     */
    public String getLicense() {
        return this.License;
    }

    /**
     * Set 商户证书
     * @param License 商户证书
     */
    public void setLicense(String License) {
        this.License = License;
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
     * Get 人群包文件名称,人群包文件必须为utf8编码，动态参数只能是汉字、数字、英文字母的组合，不能包含其他字符 
     * @return FileName 人群包文件名称,人群包文件必须为utf8编码，动态参数只能是汉字、数字、英文字母的组合，不能包含其他字符
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 人群包文件名称,人群包文件必须为utf8编码，动态参数只能是汉字、数字、英文字母的组合，不能包含其他字符
     * @param FileName 人群包文件名称,人群包文件必须为utf8编码，动态参数只能是汉字、数字、英文字母的组合，不能包含其他字符
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

    /**
     * Get 已经上传好的人群包cos地址 
     * @return CosUrl 已经上传好的人群包cos地址
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set 已经上传好的人群包cos地址
     * @param CosUrl 已经上传好的人群包cos地址
     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
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

    public AddCrowdPackInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddCrowdPackInfoRequest(AddCrowdPackInfoRequest source) {
        if (source.License != null) {
            this.License = new String(source.License);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.CosUrl != null) {
            this.CosUrl = new String(source.CosUrl);
        }
        if (source.PhoneNum != null) {
            this.PhoneNum = new Long(source.PhoneNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "License", this.License);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);

    }
}

