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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceProfile extends AbstractModel {

    /**
    * <p>值</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>属性ID(只支持32位)</p>
    */
    @SerializedName("FieldId")
    @Expose
    private Long FieldId;

    /**
    * <p>设备唯一标识码</p>
    */
    @SerializedName("Mid")
    @Expose
    private String Mid;

    /**
    * <p>名称</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>类型(只支持32位)</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>可选数据</p>
    */
    @SerializedName("Options")
    @Expose
    private String Options;

    /**
    * <p>必填数据</p>
    */
    @SerializedName("IsMust")
    @Expose
    private String IsMust;

    /**
    * <p>必填数据</p>
    */
    @SerializedName("IsCustom")
    @Expose
    private String IsCustom;

    /**
     * Get <p>值</p> 
     * @return Value <p>值</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>值</p>
     * @param Value <p>值</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>属性ID(只支持32位)</p> 
     * @return FieldId <p>属性ID(只支持32位)</p>
     */
    public Long getFieldId() {
        return this.FieldId;
    }

    /**
     * Set <p>属性ID(只支持32位)</p>
     * @param FieldId <p>属性ID(只支持32位)</p>
     */
    public void setFieldId(Long FieldId) {
        this.FieldId = FieldId;
    }

    /**
     * Get <p>设备唯一标识码</p> 
     * @return Mid <p>设备唯一标识码</p>
     */
    public String getMid() {
        return this.Mid;
    }

    /**
     * Set <p>设备唯一标识码</p>
     * @param Mid <p>设备唯一标识码</p>
     */
    public void setMid(String Mid) {
        this.Mid = Mid;
    }

    /**
     * Get <p>名称</p> 
     * @return Title <p>名称</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>名称</p>
     * @param Title <p>名称</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>类型(只支持32位)</p> 
     * @return Type <p>类型(只支持32位)</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>类型(只支持32位)</p>
     * @param Type <p>类型(只支持32位)</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>可选数据</p> 
     * @return Options <p>可选数据</p>
     */
    public String getOptions() {
        return this.Options;
    }

    /**
     * Set <p>可选数据</p>
     * @param Options <p>可选数据</p>
     */
    public void setOptions(String Options) {
        this.Options = Options;
    }

    /**
     * Get <p>必填数据</p> 
     * @return IsMust <p>必填数据</p>
     */
    public String getIsMust() {
        return this.IsMust;
    }

    /**
     * Set <p>必填数据</p>
     * @param IsMust <p>必填数据</p>
     */
    public void setIsMust(String IsMust) {
        this.IsMust = IsMust;
    }

    /**
     * Get <p>必填数据</p> 
     * @return IsCustom <p>必填数据</p>
     */
    public String getIsCustom() {
        return this.IsCustom;
    }

    /**
     * Set <p>必填数据</p>
     * @param IsCustom <p>必填数据</p>
     */
    public void setIsCustom(String IsCustom) {
        this.IsCustom = IsCustom;
    }

    public DeviceProfile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceProfile(DeviceProfile source) {
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.FieldId != null) {
            this.FieldId = new Long(source.FieldId);
        }
        if (source.Mid != null) {
            this.Mid = new String(source.Mid);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Options != null) {
            this.Options = new String(source.Options);
        }
        if (source.IsMust != null) {
            this.IsMust = new String(source.IsMust);
        }
        if (source.IsCustom != null) {
            this.IsCustom = new String(source.IsCustom);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "FieldId", this.FieldId);
        this.setParamSimple(map, prefix + "Mid", this.Mid);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Options", this.Options);
        this.setParamSimple(map, prefix + "IsMust", this.IsMust);
        this.setParamSimple(map, prefix + "IsCustom", this.IsCustom);

    }
}

