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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputCreateNameListFront extends AbstractModel {

    /**
    * 名单名称
    */
    @SerializedName("ListName")
    @Expose
    private String ListName;

    /**
    * 名单类型 [1 黑名单 2白名单]
    */
    @SerializedName("ListType")
    @Expose
    private Long ListType;

    /**
    * 数据类型[1 手机号 2 qqOpenId 3 2echatOpenId 4 ip 6 idfa 7 imei]
    */
    @SerializedName("DataType")
    @Expose
    private Long DataType;

    /**
    * 描述
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 加密类型[0 无需加密 1 MD5加密 2 SHA256加密]
    */
    @SerializedName("EncryptionType")
    @Expose
    private Long EncryptionType;

    /**
    * 场景Code，all_scene代表全部场景
    */
    @SerializedName("SceneCode")
    @Expose
    private String SceneCode;

    /**
     * Get 名单名称 
     * @return ListName 名单名称
     */
    public String getListName() {
        return this.ListName;
    }

    /**
     * Set 名单名称
     * @param ListName 名单名称
     */
    public void setListName(String ListName) {
        this.ListName = ListName;
    }

    /**
     * Get 名单类型 [1 黑名单 2白名单] 
     * @return ListType 名单类型 [1 黑名单 2白名单]
     */
    public Long getListType() {
        return this.ListType;
    }

    /**
     * Set 名单类型 [1 黑名单 2白名单]
     * @param ListType 名单类型 [1 黑名单 2白名单]
     */
    public void setListType(Long ListType) {
        this.ListType = ListType;
    }

    /**
     * Get 数据类型[1 手机号 2 qqOpenId 3 2echatOpenId 4 ip 6 idfa 7 imei] 
     * @return DataType 数据类型[1 手机号 2 qqOpenId 3 2echatOpenId 4 ip 6 idfa 7 imei]
     */
    public Long getDataType() {
        return this.DataType;
    }

    /**
     * Set 数据类型[1 手机号 2 qqOpenId 3 2echatOpenId 4 ip 6 idfa 7 imei]
     * @param DataType 数据类型[1 手机号 2 qqOpenId 3 2echatOpenId 4 ip 6 idfa 7 imei]
     */
    public void setDataType(Long DataType) {
        this.DataType = DataType;
    }

    /**
     * Get 描述 
     * @return Remark 描述
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 描述
     * @param Remark 描述
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 加密类型[0 无需加密 1 MD5加密 2 SHA256加密] 
     * @return EncryptionType 加密类型[0 无需加密 1 MD5加密 2 SHA256加密]
     */
    public Long getEncryptionType() {
        return this.EncryptionType;
    }

    /**
     * Set 加密类型[0 无需加密 1 MD5加密 2 SHA256加密]
     * @param EncryptionType 加密类型[0 无需加密 1 MD5加密 2 SHA256加密]
     */
    public void setEncryptionType(Long EncryptionType) {
        this.EncryptionType = EncryptionType;
    }

    /**
     * Get 场景Code，all_scene代表全部场景 
     * @return SceneCode 场景Code，all_scene代表全部场景
     */
    public String getSceneCode() {
        return this.SceneCode;
    }

    /**
     * Set 场景Code，all_scene代表全部场景
     * @param SceneCode 场景Code，all_scene代表全部场景
     */
    public void setSceneCode(String SceneCode) {
        this.SceneCode = SceneCode;
    }

    public InputCreateNameListFront() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputCreateNameListFront(InputCreateNameListFront source) {
        if (source.ListName != null) {
            this.ListName = new String(source.ListName);
        }
        if (source.ListType != null) {
            this.ListType = new Long(source.ListType);
        }
        if (source.DataType != null) {
            this.DataType = new Long(source.DataType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.EncryptionType != null) {
            this.EncryptionType = new Long(source.EncryptionType);
        }
        if (source.SceneCode != null) {
            this.SceneCode = new String(source.SceneCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListName", this.ListName);
        this.setParamSimple(map, prefix + "ListType", this.ListType);
        this.setParamSimple(map, prefix + "DataType", this.DataType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "EncryptionType", this.EncryptionType);
        this.setParamSimple(map, prefix + "SceneCode", this.SceneCode);

    }
}

