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
package com.tencentcloudapi.ai3d.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitProfileTo3DJobRequest extends AbstractModel {

    /**
    * 真人头像参考图 Base64 数据和参考图 Url。
- Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
- 图片限制：单边分辨率小于4096且大于500，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png。
    */
    @SerializedName("Profile")
    @Expose
    private Image Profile;

    /**
    * 生成人物模板，参考值：

basketball: 动感球手；

badminton: 羽扬中华；

pingpong: 国球荣耀；

gymnastics:勇攀巅峰；

pilidance: 舞动青春；

tennis: 网球甜心；

athletics: 东方疾风；

footballboykicking1:激情逐风；

footballboykicking2: 绿茵之星；

guitar:甜酷弦音；

footballboy: 足球小将；

skateboard: 滑跃青春；

futuresoilder: 未来战士；

explorer: 逐梦旷野；

beardollgirl:可爱女孩；

bibpantsboy:都市白领；

womansitpose: 职业丽影；

womanstandpose2: 悠闲时光；

mysteriousprincess: 海洋公主；

manstandpose2: 演讲之星；
    */
    @SerializedName("Template")
    @Expose
    private String Template;

    /**
     * Get 真人头像参考图 Base64 数据和参考图 Url。
- Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
- 图片限制：单边分辨率小于4096且大于500，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png。 
     * @return Profile 真人头像参考图 Base64 数据和参考图 Url。
- Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
- 图片限制：单边分辨率小于4096且大于500，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png。
     */
    public Image getProfile() {
        return this.Profile;
    }

    /**
     * Set 真人头像参考图 Base64 数据和参考图 Url。
- Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
- 图片限制：单边分辨率小于4096且大于500，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png。
     * @param Profile 真人头像参考图 Base64 数据和参考图 Url。
- Base64 和 Url 必须提供一个，如果都提供以 Url 为准。
- 图片限制：单边分辨率小于4096且大于500，转成 Base64 字符串后小于 10MB，格式支持 jpg、jpeg、png。
     */
    public void setProfile(Image Profile) {
        this.Profile = Profile;
    }

    /**
     * Get 生成人物模板，参考值：

basketball: 动感球手；

badminton: 羽扬中华；

pingpong: 国球荣耀；

gymnastics:勇攀巅峰；

pilidance: 舞动青春；

tennis: 网球甜心；

athletics: 东方疾风；

footballboykicking1:激情逐风；

footballboykicking2: 绿茵之星；

guitar:甜酷弦音；

footballboy: 足球小将；

skateboard: 滑跃青春；

futuresoilder: 未来战士；

explorer: 逐梦旷野；

beardollgirl:可爱女孩；

bibpantsboy:都市白领；

womansitpose: 职业丽影；

womanstandpose2: 悠闲时光；

mysteriousprincess: 海洋公主；

manstandpose2: 演讲之星； 
     * @return Template 生成人物模板，参考值：

basketball: 动感球手；

badminton: 羽扬中华；

pingpong: 国球荣耀；

gymnastics:勇攀巅峰；

pilidance: 舞动青春；

tennis: 网球甜心；

athletics: 东方疾风；

footballboykicking1:激情逐风；

footballboykicking2: 绿茵之星；

guitar:甜酷弦音；

footballboy: 足球小将；

skateboard: 滑跃青春；

futuresoilder: 未来战士；

explorer: 逐梦旷野；

beardollgirl:可爱女孩；

bibpantsboy:都市白领；

womansitpose: 职业丽影；

womanstandpose2: 悠闲时光；

mysteriousprincess: 海洋公主；

manstandpose2: 演讲之星；
     */
    public String getTemplate() {
        return this.Template;
    }

    /**
     * Set 生成人物模板，参考值：

basketball: 动感球手；

badminton: 羽扬中华；

pingpong: 国球荣耀；

gymnastics:勇攀巅峰；

pilidance: 舞动青春；

tennis: 网球甜心；

athletics: 东方疾风；

footballboykicking1:激情逐风；

footballboykicking2: 绿茵之星；

guitar:甜酷弦音；

footballboy: 足球小将；

skateboard: 滑跃青春；

futuresoilder: 未来战士；

explorer: 逐梦旷野；

beardollgirl:可爱女孩；

bibpantsboy:都市白领；

womansitpose: 职业丽影；

womanstandpose2: 悠闲时光；

mysteriousprincess: 海洋公主；

manstandpose2: 演讲之星；
     * @param Template 生成人物模板，参考值：

basketball: 动感球手；

badminton: 羽扬中华；

pingpong: 国球荣耀；

gymnastics:勇攀巅峰；

pilidance: 舞动青春；

tennis: 网球甜心；

athletics: 东方疾风；

footballboykicking1:激情逐风；

footballboykicking2: 绿茵之星；

guitar:甜酷弦音；

footballboy: 足球小将；

skateboard: 滑跃青春；

futuresoilder: 未来战士；

explorer: 逐梦旷野；

beardollgirl:可爱女孩；

bibpantsboy:都市白领；

womansitpose: 职业丽影；

womanstandpose2: 悠闲时光；

mysteriousprincess: 海洋公主；

manstandpose2: 演讲之星；
     */
    public void setTemplate(String Template) {
        this.Template = Template;
    }

    public SubmitProfileTo3DJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitProfileTo3DJobRequest(SubmitProfileTo3DJobRequest source) {
        if (source.Profile != null) {
            this.Profile = new Image(source.Profile);
        }
        if (source.Template != null) {
            this.Template = new String(source.Template);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Profile.", this.Profile);
        this.setParamSimple(map, prefix + "Template", this.Template);

    }
}

