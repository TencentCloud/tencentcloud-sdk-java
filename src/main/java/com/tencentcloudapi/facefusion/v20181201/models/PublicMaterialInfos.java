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
package com.tencentcloudapi.facefusion.v20181201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublicMaterialInfos extends AbstractModel{

    /**
    * 素材Id
    */
    @SerializedName("MaterialId")
    @Expose
    private String MaterialId;

    /**
    * 素材状态
    */
    @SerializedName("MaterialStatus")
    @Expose
    private Long MaterialStatus;

    /**
    * 脸型参数P图
    */
    @SerializedName("BlendParamPtu")
    @Expose
    private Long BlendParamPtu;

    /**
    * 五官参数P图
    */
    @SerializedName("PositionParamPtu")
    @Expose
    private Long PositionParamPtu;

    /**
    * 脸型参数优图
    */
    @SerializedName("BlendParamYoutu")
    @Expose
    private Long BlendParamYoutu;

    /**
    * 五官参数优图
    */
    @SerializedName("PositionParamYoutu")
    @Expose
    private Long PositionParamYoutu;

    /**
    * 素材COS地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 人脸信息
    */
    @SerializedName("MaterialFaceList")
    @Expose
    private MaterialFaceList [] MaterialFaceList;

    /**
     * Get 素材Id 
     * @return MaterialId 素材Id
     */
    public String getMaterialId() {
        return this.MaterialId;
    }

    /**
     * Set 素材Id
     * @param MaterialId 素材Id
     */
    public void setMaterialId(String MaterialId) {
        this.MaterialId = MaterialId;
    }

    /**
     * Get 素材状态 
     * @return MaterialStatus 素材状态
     */
    public Long getMaterialStatus() {
        return this.MaterialStatus;
    }

    /**
     * Set 素材状态
     * @param MaterialStatus 素材状态
     */
    public void setMaterialStatus(Long MaterialStatus) {
        this.MaterialStatus = MaterialStatus;
    }

    /**
     * Get 脸型参数P图 
     * @return BlendParamPtu 脸型参数P图
     */
    public Long getBlendParamPtu() {
        return this.BlendParamPtu;
    }

    /**
     * Set 脸型参数P图
     * @param BlendParamPtu 脸型参数P图
     */
    public void setBlendParamPtu(Long BlendParamPtu) {
        this.BlendParamPtu = BlendParamPtu;
    }

    /**
     * Get 五官参数P图 
     * @return PositionParamPtu 五官参数P图
     */
    public Long getPositionParamPtu() {
        return this.PositionParamPtu;
    }

    /**
     * Set 五官参数P图
     * @param PositionParamPtu 五官参数P图
     */
    public void setPositionParamPtu(Long PositionParamPtu) {
        this.PositionParamPtu = PositionParamPtu;
    }

    /**
     * Get 脸型参数优图 
     * @return BlendParamYoutu 脸型参数优图
     */
    public Long getBlendParamYoutu() {
        return this.BlendParamYoutu;
    }

    /**
     * Set 脸型参数优图
     * @param BlendParamYoutu 脸型参数优图
     */
    public void setBlendParamYoutu(Long BlendParamYoutu) {
        this.BlendParamYoutu = BlendParamYoutu;
    }

    /**
     * Get 五官参数优图 
     * @return PositionParamYoutu 五官参数优图
     */
    public Long getPositionParamYoutu() {
        return this.PositionParamYoutu;
    }

    /**
     * Set 五官参数优图
     * @param PositionParamYoutu 五官参数优图
     */
    public void setPositionParamYoutu(Long PositionParamYoutu) {
        this.PositionParamYoutu = PositionParamYoutu;
    }

    /**
     * Get 素材COS地址 
     * @return Url 素材COS地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 素材COS地址
     * @param Url 素材COS地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return UpdateTime 修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间
     * @param UpdateTime 修改时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 人脸信息 
     * @return MaterialFaceList 人脸信息
     */
    public MaterialFaceList [] getMaterialFaceList() {
        return this.MaterialFaceList;
    }

    /**
     * Set 人脸信息
     * @param MaterialFaceList 人脸信息
     */
    public void setMaterialFaceList(MaterialFaceList [] MaterialFaceList) {
        this.MaterialFaceList = MaterialFaceList;
    }

    public PublicMaterialInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublicMaterialInfos(PublicMaterialInfos source) {
        if (source.MaterialId != null) {
            this.MaterialId = new String(source.MaterialId);
        }
        if (source.MaterialStatus != null) {
            this.MaterialStatus = new Long(source.MaterialStatus);
        }
        if (source.BlendParamPtu != null) {
            this.BlendParamPtu = new Long(source.BlendParamPtu);
        }
        if (source.PositionParamPtu != null) {
            this.PositionParamPtu = new Long(source.PositionParamPtu);
        }
        if (source.BlendParamYoutu != null) {
            this.BlendParamYoutu = new Long(source.BlendParamYoutu);
        }
        if (source.PositionParamYoutu != null) {
            this.PositionParamYoutu = new Long(source.PositionParamYoutu);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.MaterialFaceList != null) {
            this.MaterialFaceList = new MaterialFaceList[source.MaterialFaceList.length];
            for (int i = 0; i < source.MaterialFaceList.length; i++) {
                this.MaterialFaceList[i] = new MaterialFaceList(source.MaterialFaceList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaterialId", this.MaterialId);
        this.setParamSimple(map, prefix + "MaterialStatus", this.MaterialStatus);
        this.setParamSimple(map, prefix + "BlendParamPtu", this.BlendParamPtu);
        this.setParamSimple(map, prefix + "PositionParamPtu", this.PositionParamPtu);
        this.setParamSimple(map, prefix + "BlendParamYoutu", this.BlendParamYoutu);
        this.setParamSimple(map, prefix + "PositionParamYoutu", this.PositionParamYoutu);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "MaterialFaceList.", this.MaterialFaceList);

    }
}

