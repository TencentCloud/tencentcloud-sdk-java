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
package com.tencentcloudapi.ims.v20200713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ObjectDetail extends AbstractModel{

    /**
    * 序号
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 标签名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 标签值，
当标签为二维码时，表示URL地址，如Name为QrCode时，Value为"http//abc.com/aaa"
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 分数
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 检测框坐标
    */
    @SerializedName("Location")
    @Expose
    private Location Location;

    /**
     * Get 序号 
     * @return Id 序号
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 序号
     * @param Id 序号
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 标签名称 
     * @return Name 标签名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 标签名称
     * @param Name 标签名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 标签值，
当标签为二维码时，表示URL地址，如Name为QrCode时，Value为"http//abc.com/aaa" 
     * @return Value 标签值，
当标签为二维码时，表示URL地址，如Name为QrCode时，Value为"http//abc.com/aaa"
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 标签值，
当标签为二维码时，表示URL地址，如Name为QrCode时，Value为"http//abc.com/aaa"
     * @param Value 标签值，
当标签为二维码时，表示URL地址，如Name为QrCode时，Value为"http//abc.com/aaa"
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 分数 
     * @return Score 分数
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 分数
     * @param Score 分数
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 检测框坐标 
     * @return Location 检测框坐标
     */
    public Location getLocation() {
        return this.Location;
    }

    /**
     * Set 检测框坐标
     * @param Location 检测框坐标
     */
    public void setLocation(Location Location) {
        this.Location = Location;
    }

    public ObjectDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ObjectDetail(ObjectDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Location != null) {
            this.Location = new Location(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamObj(map, prefix + "Location.", this.Location);

    }
}

