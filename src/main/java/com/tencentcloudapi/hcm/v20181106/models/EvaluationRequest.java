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
package com.tencentcloudapi.hcm.v20181106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EvaluationRequest  extends AbstractModel{

    /**
    * 图片唯一标识，一张图片一个SessionId；
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 图片数据，需要使用base64对图片的二进制数据进行编码，与url参数二者填一即可；
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 HcmAppId 可以在[控制台](https://console.cloud.tencent.com/hcm)【应用管理】下新建。
    */
    @SerializedName("HcmAppid")
    @Expose
    private String HcmAppid;

    /**
    * 图片url，与Image参数二者填一即可；
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * 获取图片唯一标识，一张图片一个SessionId；
     * @return SessionId 图片唯一标识，一张图片一个SessionId；
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * 设置图片唯一标识，一张图片一个SessionId；
     * @param SessionId 图片唯一标识，一张图片一个SessionId；
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * 获取图片数据，需要使用base64对图片的二进制数据进行编码，与url参数二者填一即可；
     * @return Image 图片数据，需要使用base64对图片的二进制数据进行编码，与url参数二者填一即可；
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * 设置图片数据，需要使用base64对图片的二进制数据进行编码，与url参数二者填一即可；
     * @param Image 图片数据，需要使用base64对图片的二进制数据进行编码，与url参数二者填一即可；
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * 获取业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 HcmAppId 可以在[控制台](https://console.cloud.tencent.com/hcm)【应用管理】下新建。
     * @return HcmAppid 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 HcmAppId 可以在[控制台](https://console.cloud.tencent.com/hcm)【应用管理】下新建。
     */
    public String getHcmAppid() {
        return this.HcmAppid;
    }

    /**
     * 设置业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 HcmAppId 可以在[控制台](https://console.cloud.tencent.com/hcm)【应用管理】下新建。
     * @param HcmAppid 业务应用ID，与账号应用APPID无关，是用来方便客户管理服务的参数，新的 HcmAppId 可以在[控制台](https://console.cloud.tencent.com/hcm)【应用管理】下新建。
     */
    public void setHcmAppid(String HcmAppid) {
        this.HcmAppid = HcmAppid;
    }

    /**
     * 获取图片url，与Image参数二者填一即可；
     * @return Url 图片url，与Image参数二者填一即可；
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置图片url，与Image参数二者填一即可；
     * @param Url 图片url，与Image参数二者填一即可；
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "HcmAppid", this.HcmAppid);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

