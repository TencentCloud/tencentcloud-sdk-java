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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertificateInfo extends AbstractModel{

    /**
    * 证件号码。
    */
    @SerializedName("CertificateCode")
    @Expose
    private String CertificateCode;

    /**
    * 证件类型。
SFZ: 身份证。
HZ: 护照。
TXZ: 中国港澳居民来往内地通行证。
TWSFZ: 中国台湾居民来往大陆通行证。
GWSFZ: 外国人永久居留身份证。
ORG: 组织机构代码证
YYZZ: 工商营业执照。
TYDMZ: 统一社会信用代码证书。
BDDH: 部队代号
JDXKZ: 军队单位对外有偿服务许可证。
SYZS: 事业单位法定代表人证书。
GWCZDJZ: 外国企业常驻代表机构登记证。
STDJZ: 社会团体法定代表人登记证书。
ZJDJZ: 宗教活动场所登记证。
MBDJZ: 民办非企业单位登记证书。
JJDJZ: 基金会法定代表人登记证书。
LSXKZ: 律师事务所执业许可证。
GWZHDJZ: 外国在华文化中心登记证。
GWLYDJZ: 外国政府旅游部门常驻代表机构批准登记证。
SFXKZ: 司法鉴定许可证
GWJGZJ: 外国机构证件。
SHFWJGZ: 社会服务机构登记证书。
MBXXXKZ: 民办学校办学许可证。
YLJGXKZ: 医疗机构执业许可证。
GAJZZ: 中国港澳居住证。
TWJZZ: 中国台湾居住证。
QTTYDM: 其他-统一社会信用代码证书。
GZJGZY: 公证机构执业证。
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * 证件照片地址。
    */
    @SerializedName("ImgUrl")
    @Expose
    private String ImgUrl;

    /**
     * Get 证件号码。 
     * @return CertificateCode 证件号码。
     */
    public String getCertificateCode() {
        return this.CertificateCode;
    }

    /**
     * Set 证件号码。
     * @param CertificateCode 证件号码。
     */
    public void setCertificateCode(String CertificateCode) {
        this.CertificateCode = CertificateCode;
    }

    /**
     * Get 证件类型。
SFZ: 身份证。
HZ: 护照。
TXZ: 中国港澳居民来往内地通行证。
TWSFZ: 中国台湾居民来往大陆通行证。
GWSFZ: 外国人永久居留身份证。
ORG: 组织机构代码证
YYZZ: 工商营业执照。
TYDMZ: 统一社会信用代码证书。
BDDH: 部队代号
JDXKZ: 军队单位对外有偿服务许可证。
SYZS: 事业单位法定代表人证书。
GWCZDJZ: 外国企业常驻代表机构登记证。
STDJZ: 社会团体法定代表人登记证书。
ZJDJZ: 宗教活动场所登记证。
MBDJZ: 民办非企业单位登记证书。
JJDJZ: 基金会法定代表人登记证书。
LSXKZ: 律师事务所执业许可证。
GWZHDJZ: 外国在华文化中心登记证。
GWLYDJZ: 外国政府旅游部门常驻代表机构批准登记证。
SFXKZ: 司法鉴定许可证
GWJGZJ: 外国机构证件。
SHFWJGZ: 社会服务机构登记证书。
MBXXXKZ: 民办学校办学许可证。
YLJGXKZ: 医疗机构执业许可证。
GAJZZ: 中国港澳居住证。
TWJZZ: 中国台湾居住证。
QTTYDM: 其他-统一社会信用代码证书。
GZJGZY: 公证机构执业证。 
     * @return CertificateType 证件类型。
SFZ: 身份证。
HZ: 护照。
TXZ: 中国港澳居民来往内地通行证。
TWSFZ: 中国台湾居民来往大陆通行证。
GWSFZ: 外国人永久居留身份证。
ORG: 组织机构代码证
YYZZ: 工商营业执照。
TYDMZ: 统一社会信用代码证书。
BDDH: 部队代号
JDXKZ: 军队单位对外有偿服务许可证。
SYZS: 事业单位法定代表人证书。
GWCZDJZ: 外国企业常驻代表机构登记证。
STDJZ: 社会团体法定代表人登记证书。
ZJDJZ: 宗教活动场所登记证。
MBDJZ: 民办非企业单位登记证书。
JJDJZ: 基金会法定代表人登记证书。
LSXKZ: 律师事务所执业许可证。
GWZHDJZ: 外国在华文化中心登记证。
GWLYDJZ: 外国政府旅游部门常驻代表机构批准登记证。
SFXKZ: 司法鉴定许可证
GWJGZJ: 外国机构证件。
SHFWJGZ: 社会服务机构登记证书。
MBXXXKZ: 民办学校办学许可证。
YLJGXKZ: 医疗机构执业许可证。
GAJZZ: 中国港澳居住证。
TWJZZ: 中国台湾居住证。
QTTYDM: 其他-统一社会信用代码证书。
GZJGZY: 公证机构执业证。
     */
    public String getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set 证件类型。
SFZ: 身份证。
HZ: 护照。
TXZ: 中国港澳居民来往内地通行证。
TWSFZ: 中国台湾居民来往大陆通行证。
GWSFZ: 外国人永久居留身份证。
ORG: 组织机构代码证
YYZZ: 工商营业执照。
TYDMZ: 统一社会信用代码证书。
BDDH: 部队代号
JDXKZ: 军队单位对外有偿服务许可证。
SYZS: 事业单位法定代表人证书。
GWCZDJZ: 外国企业常驻代表机构登记证。
STDJZ: 社会团体法定代表人登记证书。
ZJDJZ: 宗教活动场所登记证。
MBDJZ: 民办非企业单位登记证书。
JJDJZ: 基金会法定代表人登记证书。
LSXKZ: 律师事务所执业许可证。
GWZHDJZ: 外国在华文化中心登记证。
GWLYDJZ: 外国政府旅游部门常驻代表机构批准登记证。
SFXKZ: 司法鉴定许可证
GWJGZJ: 外国机构证件。
SHFWJGZ: 社会服务机构登记证书。
MBXXXKZ: 民办学校办学许可证。
YLJGXKZ: 医疗机构执业许可证。
GAJZZ: 中国港澳居住证。
TWJZZ: 中国台湾居住证。
QTTYDM: 其他-统一社会信用代码证书。
GZJGZY: 公证机构执业证。
     * @param CertificateType 证件类型。
SFZ: 身份证。
HZ: 护照。
TXZ: 中国港澳居民来往内地通行证。
TWSFZ: 中国台湾居民来往大陆通行证。
GWSFZ: 外国人永久居留身份证。
ORG: 组织机构代码证
YYZZ: 工商营业执照。
TYDMZ: 统一社会信用代码证书。
BDDH: 部队代号
JDXKZ: 军队单位对外有偿服务许可证。
SYZS: 事业单位法定代表人证书。
GWCZDJZ: 外国企业常驻代表机构登记证。
STDJZ: 社会团体法定代表人登记证书。
ZJDJZ: 宗教活动场所登记证。
MBDJZ: 民办非企业单位登记证书。
JJDJZ: 基金会法定代表人登记证书。
LSXKZ: 律师事务所执业许可证。
GWZHDJZ: 外国在华文化中心登记证。
GWLYDJZ: 外国政府旅游部门常驻代表机构批准登记证。
SFXKZ: 司法鉴定许可证
GWJGZJ: 外国机构证件。
SHFWJGZ: 社会服务机构登记证书。
MBXXXKZ: 民办学校办学许可证。
YLJGXKZ: 医疗机构执业许可证。
GAJZZ: 中国港澳居住证。
TWJZZ: 中国台湾居住证。
QTTYDM: 其他-统一社会信用代码证书。
GZJGZY: 公证机构执业证。
     */
    public void setCertificateType(String CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get 证件照片地址。 
     * @return ImgUrl 证件照片地址。
     */
    public String getImgUrl() {
        return this.ImgUrl;
    }

    /**
     * Set 证件照片地址。
     * @param ImgUrl 证件照片地址。
     */
    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }

    public CertificateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertificateInfo(CertificateInfo source) {
        if (source.CertificateCode != null) {
            this.CertificateCode = new String(source.CertificateCode);
        }
        if (source.CertificateType != null) {
            this.CertificateType = new String(source.CertificateType);
        }
        if (source.ImgUrl != null) {
            this.ImgUrl = new String(source.ImgUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateCode", this.CertificateCode);
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "ImgUrl", this.ImgUrl);

    }
}

