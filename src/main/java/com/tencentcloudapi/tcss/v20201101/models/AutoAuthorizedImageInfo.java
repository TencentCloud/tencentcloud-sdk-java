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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoAuthorizedImageInfo extends AbstractModel{

    /**
    * 镜像id
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 授权时间
    */
    @SerializedName("AuthorizedTime")
    @Expose
    private String AuthorizedTime;

    /**
    * 授权结果，SUCCESS:成功，REACH_LIMIT:达到授权上限，LICENSE_INSUFFICIENT:授权数不足'
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 是否授权，1：是，0：否
    */
    @SerializedName("IsAuthorized")
    @Expose
    private Long IsAuthorized;

    /**
     * Get 镜像id 
     * @return ImageId 镜像id
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像id
     * @param ImageId 镜像id
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 镜像名称 
     * @return ImageName 镜像名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
     * @param ImageName 镜像名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 授权时间 
     * @return AuthorizedTime 授权时间
     */
    public String getAuthorizedTime() {
        return this.AuthorizedTime;
    }

    /**
     * Set 授权时间
     * @param AuthorizedTime 授权时间
     */
    public void setAuthorizedTime(String AuthorizedTime) {
        this.AuthorizedTime = AuthorizedTime;
    }

    /**
     * Get 授权结果，SUCCESS:成功，REACH_LIMIT:达到授权上限，LICENSE_INSUFFICIENT:授权数不足' 
     * @return Status 授权结果，SUCCESS:成功，REACH_LIMIT:达到授权上限，LICENSE_INSUFFICIENT:授权数不足'
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 授权结果，SUCCESS:成功，REACH_LIMIT:达到授权上限，LICENSE_INSUFFICIENT:授权数不足'
     * @param Status 授权结果，SUCCESS:成功，REACH_LIMIT:达到授权上限，LICENSE_INSUFFICIENT:授权数不足'
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 是否授权，1：是，0：否 
     * @return IsAuthorized 是否授权，1：是，0：否
     */
    public Long getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set 是否授权，1：是，0：否
     * @param IsAuthorized 是否授权，1：是，0：否
     */
    public void setIsAuthorized(Long IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
    }

    public AutoAuthorizedImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoAuthorizedImageInfo(AutoAuthorizedImageInfo source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.AuthorizedTime != null) {
            this.AuthorizedTime = new String(source.AuthorizedTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IsAuthorized != null) {
            this.IsAuthorized = new Long(source.IsAuthorized);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "AuthorizedTime", this.AuthorizedTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsAuthorized", this.IsAuthorized);

    }
}

