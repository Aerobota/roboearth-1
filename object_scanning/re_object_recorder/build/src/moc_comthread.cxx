/****************************************************************************
** Meta object code from reading C++ file 'comthread.h'
**
** Created: Mon Oct 21 11:27:53 2013
**      by: The Qt Meta Object Compiler version 63 (Qt 4.8.1)
**
** WARNING! All changes made in this file will be lost!
*****************************************************************************/

#include "../../src/comthread.h"
#if !defined(Q_MOC_OUTPUT_REVISION)
#error "The header file 'comthread.h' doesn't include <QObject>."
#elif Q_MOC_OUTPUT_REVISION != 63
#error "This file was generated using the moc from 4.8.1. It"
#error "cannot be used with the include files from this version of Qt."
#error "(The moc has changed too much.)"
#endif

QT_BEGIN_MOC_NAMESPACE
static const uint qt_meta_data_ComThread[] = {

 // content:
       6,       // revision
       0,       // classname
       0,    0, // classinfo
      12,   14, // methods
       0,    0, // properties
       0,    0, // enums/sets
       0,    0, // constructors
       0,       // flags
       2,       // signalCount

 // signals: signature, parameters, type, tag, flags
      11,   10,   10,   10, 0x05,
      37,   10,   10,   10, 0x05,

 // slots: signature, parameters, type, tag, flags
      73,   63,   10,   10, 0x0a,
      89,   10,   10,   10, 0x0a,
      97,   10,   10,   10, 0x0a,
     122,   10,   10,   10, 0x0a,
     147,   10,   10,   10, 0x0a,
     192,  170,   10,   10, 0x0a,
     228,  170,   10,   10, 0x0a,
     261,   10,   10,   10, 0x0a,
     293,  287,   10,   10, 0x0a,
     319,  287,   10,   10, 0x0a,

       0        // eod
};

static const char qt_meta_stringdata_ComThread[] = {
    "ComThread\0\0addStatusMessage(QString)\0"
    "newCloudReceived(QString)\0startstop\0"
    "recording(bool)\0reset()\0"
    "removeCloud(QStringList)\0"
    "selectCloud(QStringList)\0"
    "changedBoxSize(double)\0parent_dir,model_name\0"
    "createRe_visionModel(QDir&,QString)\0"
    "createKinectModel(QDir&,QString)\0"
    "maxScanNumberChanged(int)\0value\0"
    "markerSizeChanged(double)\0"
    "markerSpacingChanged(double)\0"
};

void ComThread::qt_static_metacall(QObject *_o, QMetaObject::Call _c, int _id, void **_a)
{
    if (_c == QMetaObject::InvokeMetaMethod) {
        Q_ASSERT(staticMetaObject.cast(_o));
        ComThread *_t = static_cast<ComThread *>(_o);
        switch (_id) {
        case 0: _t->addStatusMessage((*reinterpret_cast< QString(*)>(_a[1]))); break;
        case 1: _t->newCloudReceived((*reinterpret_cast< QString(*)>(_a[1]))); break;
        case 2: _t->recording((*reinterpret_cast< bool(*)>(_a[1]))); break;
        case 3: _t->reset(); break;
        case 4: _t->removeCloud((*reinterpret_cast< QStringList(*)>(_a[1]))); break;
        case 5: _t->selectCloud((*reinterpret_cast< QStringList(*)>(_a[1]))); break;
        case 6: _t->changedBoxSize((*reinterpret_cast< double(*)>(_a[1]))); break;
        case 7: _t->createRe_visionModel((*reinterpret_cast< QDir(*)>(_a[1])),(*reinterpret_cast< const QString(*)>(_a[2]))); break;
        case 8: _t->createKinectModel((*reinterpret_cast< QDir(*)>(_a[1])),(*reinterpret_cast< const QString(*)>(_a[2]))); break;
        case 9: _t->maxScanNumberChanged((*reinterpret_cast< int(*)>(_a[1]))); break;
        case 10: _t->markerSizeChanged((*reinterpret_cast< double(*)>(_a[1]))); break;
        case 11: _t->markerSpacingChanged((*reinterpret_cast< double(*)>(_a[1]))); break;
        default: ;
        }
    }
}

const QMetaObjectExtraData ComThread::staticMetaObjectExtraData = {
    0,  qt_static_metacall 
};

const QMetaObject ComThread::staticMetaObject = {
    { &QThread::staticMetaObject, qt_meta_stringdata_ComThread,
      qt_meta_data_ComThread, &staticMetaObjectExtraData }
};

#ifdef Q_NO_DATA_RELOCATION
const QMetaObject &ComThread::getStaticMetaObject() { return staticMetaObject; }
#endif //Q_NO_DATA_RELOCATION

const QMetaObject *ComThread::metaObject() const
{
    return QObject::d_ptr->metaObject ? QObject::d_ptr->metaObject : &staticMetaObject;
}

void *ComThread::qt_metacast(const char *_clname)
{
    if (!_clname) return 0;
    if (!strcmp(_clname, qt_meta_stringdata_ComThread))
        return static_cast<void*>(const_cast< ComThread*>(this));
    return QThread::qt_metacast(_clname);
}

int ComThread::qt_metacall(QMetaObject::Call _c, int _id, void **_a)
{
    _id = QThread::qt_metacall(_c, _id, _a);
    if (_id < 0)
        return _id;
    if (_c == QMetaObject::InvokeMetaMethod) {
        if (_id < 12)
            qt_static_metacall(this, _c, _id, _a);
        _id -= 12;
    }
    return _id;
}

// SIGNAL 0
void ComThread::addStatusMessage(QString _t1)
{
    void *_a[] = { 0, const_cast<void*>(reinterpret_cast<const void*>(&_t1)) };
    QMetaObject::activate(this, &staticMetaObject, 0, _a);
}

// SIGNAL 1
void ComThread::newCloudReceived(QString _t1)
{
    void *_a[] = { 0, const_cast<void*>(reinterpret_cast<const void*>(&_t1)) };
    QMetaObject::activate(this, &staticMetaObject, 1, _a);
}
QT_END_MOC_NAMESPACE
